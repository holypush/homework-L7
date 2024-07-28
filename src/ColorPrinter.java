public class ColorPrinter {
    public static void printColor() {
        int value = 75; // Задайте любое значение

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void main(String[] args) {
        printColor(); // Вызов метода printColor
    }
}
