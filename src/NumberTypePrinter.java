public class NumberTypePrinter {
public static void printNumberType(int number) {
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number == 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void main(String[] args) {
        printNumberType(1); // Положительное
        printNumberType(0); // Положительное
        printNumberType(-1); // Отрицательное
    }
}
