public class StringRepeator {
public static void repeatString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        repeatString("Привет", 3); // Привет
                                             // Привет
                                             // Привет
    }
}
