import java.util.Arrays;

public class FillArrays {
 public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        // Выводим массив на экран
        System.out.println(Arrays.toString(array));
    }
 }