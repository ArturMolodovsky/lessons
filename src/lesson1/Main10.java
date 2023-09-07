package lesson1;

public class Main10 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean result1 = a&&b&&c;
        boolean result2 = a||b&&c;
        System.out.println(result1);
        System.out.println(result2);
    }
}
