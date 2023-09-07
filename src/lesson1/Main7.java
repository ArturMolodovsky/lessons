package lesson1;

public class Main7 {
    public static void main(String[] args) {
        int a = 5, b=3;
        int c = a - b++;
        System.out.println(c);/* ответ 2; инкремент: число b после вычитания увеличивается на 1 (префикс ++)
                          но после вычитания ни на что не влияет */
        /*int d = a - ++b;
        System.out.println(d); //ответ 1; инкремент: число b до вычитания увеличивается на 1 (префикс ++)

         */
        int d = a - b;
        System.out.println(d); // ответ 1, т.к. b уже =4

    }
}
