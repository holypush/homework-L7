import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    // Конструктор
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber);
    }

    // Метод для получения номеров телефонов по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();

        // Добавляем записи
        myPhoneBook.add("Иванов", "123-456");
        myPhoneBook.add("Петров", "987-654");
        myPhoneBook.add("Иванов", "321-654");
        myPhoneBook.add("Сидоров", "555-555");
        myPhoneBook.add("Иванова", "999-587"); // Похожая фамилия - не выводится

        // Получаем номера телефонов по фамилии
        System.out.println("Номера телефонов Иванов: " + myPhoneBook.get("Иванов"));
        System.out.println("Номера телефонов Петров: " + myPhoneBook.get("Петров"));
        System.out.println("Номера телефонов Сидоров: " + myPhoneBook.get("Сидоров"));
        System.out.println("Номера телефонов Смирнов: " + myPhoneBook.get("Смирнов")); // Не существует
    }
}