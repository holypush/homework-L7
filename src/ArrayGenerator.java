import java.util.Arrays;

public class ArrayGenerator {
public static int[] generateArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void main(String[] args) {
        // Пример использования метода
        int[] myArray = generateArray(20, 10);
        System.out.println(Arrays.toString(myArray)); // [10, 10, 10, 10, 10]
    }
}
