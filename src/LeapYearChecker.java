public class LeapYearChecker {
 public static boolean isLeapYear(int year) {
        // Проверяем, делится ли год на 4
        if (year % 4 == 0) {
            // Если год делится на 100, то проверяем, делится ли он еще и на 400
            if (year % 100 == 0) {
                return year % 400 == 0; // Если делится на 400, то год високосный
            } else {
                return true; // Если не делится на 100, то просто возвращаем true
            }
        } else {
            return false; // Если не делится на 4, то год не високосный
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020)); // true
        System.out.println(isLeapYear(2021)); // false
        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(2100)); // false
        System.out.println(isLeapYear(2400)); // true
    }
}
