package lesson1;

public class Main5 {
    public static void main(String[] args) {
        int a = 9, b = 5;
        int c = a/b;
        int d = a%b;

        System.out.println(c); /* ответ=1, т.к. дробная часть не учитывается для int
         чтобы появилась дробная части, необходимо установть для a и b тип данных float, или double */
        System.out.println(d); //просмотрим остаток от деления а на b
    }
}
