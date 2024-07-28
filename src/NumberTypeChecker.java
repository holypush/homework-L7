public class NumberTypeChecker {
public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void main(String[] args) {
        System.out.println(isNegative(-1)); // true
        System.out.println(isNegative(0)); // false
        System.out.println(isNegative(1)); // false
    }
}
