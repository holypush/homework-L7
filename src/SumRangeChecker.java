public class SumRangeChecker {
public static boolean isSumInRange(int a, int b) {
        // Проверяем, что оба числа неотрицательные
        if (a < 0 || b < 0) {
            return false;
        }

        // Вычисляем сумму двух чисел
        int sum = a + b;

        // Возвращаем true, если сумма находится в требуемом диапазоне
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        System.out.println("1 + 9 = " + isSumInRange(1, 9)); // true
        System.out.println("1 + 11 = " + isSumInRange(1, 11)); // true
        System.out.println("1 + 21 = " + isSumInRange(1, 21)); // false
        System.out.println("-1 + 11 = " + isSumInRange(-1, 11)); // false
    }
}
