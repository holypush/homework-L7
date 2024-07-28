public class DiagonalMatrix {
public static void main(String[] args) {
        // Размер массива
        int size = 10;

        // Создаем двумерный массив
        int[][] matrix = new int[size][size];

        // Заполняем главную диагональ единицами
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        // Заполняем побочную диагональ единицами
        for (int i = 0; i < size; i++) {
            matrix[i][size - 1 - i] = 1;
        }

        // Выводим матрицу на экран
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
