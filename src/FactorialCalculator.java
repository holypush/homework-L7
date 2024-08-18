public class FactorialCalculator {
    // Метод для вычисления факториала
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным.");
        } else if (number == 0 || number == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}

