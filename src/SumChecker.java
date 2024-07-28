public class SumChecker {
// Метод для проверки знака суммы
    public static void checkSumSign() {
        // Объявляем и инициализируем переменные a и b
        int a = 5;  // Вы можете задать любое значение
        int b = -3; // Вы можете задать любое значение

        // Вычисляем сумму переменных
        int sum = a + b;

        // Проверка знака суммы и вывод соответствующего сообщения
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Метод main для запуска программы
    public static void main(String[] args) {
        checkSumSign(); // Вызов метода проверки суммы
    }
}
