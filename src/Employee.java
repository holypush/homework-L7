public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    // Конструктор с параметрами для заполнения полей
    public Employee(String firstName, String lastName, String position, String email, String phoneNumber, double salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации об объекте
    public void printInfo() {
        System.out.println("ФИО: " + firstName + " " + lastName);
        System.out.println("Должность: " + position);
        
    System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }



    public static void main(String[] args) {
        // Создание массива из 5 сотрудников
        Employee[] employees = new Employee[5];

        // Заполнение массива объектами
        employees[0] = new Employee("Иванов", "Иван", "Инженер", "ivanov@company.com", "892312312", 30000, 30);
        employees[1] = new Employee("Петров", "Петр", "Менеджер", "petrov@company.com", "892312313", 40000, 35);
        employees[2] = new Employee("Сидоров", "Сидор", "Программист", "sidorov@company.com", "892312314", 50000, 25);
        employees[3] = new Employee("Васильев", "Василий", "Дизайнер", "vasiliev@company.com", "892312315", 45000, 32);
        employees[4] = new Employee("Кузнецов", "Кузьма", "Бухгалтер", "kuznetsov@company.com", "892312316", 35000, 40);

        // Вывод информации о каждом сотруднике
        for (Employee employee : employees) {
            employee.printInfo();
        }
    }
}