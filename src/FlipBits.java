import java.util.Arrays;

public class FlipBits {
public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] ^ 1; // Используем XOR для инвертирования битов
        }

        System.out.println(Arrays.toString(array));
    }
}
