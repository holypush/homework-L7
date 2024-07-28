public class NumbersComparer {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 10; // Инициализируем переменную a
        int b = 5;  // Инициализируем переменную b

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
