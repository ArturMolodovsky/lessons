package lesson1;

public class Main6 {
    public static void main(String[] args) {
        int a = 10, b=5;
        int c = --a - b;
        System.out.println(c); //ответ 4, т.к. декремент используется как префикс (сначала а уменьшается на 1)

        int d = a-- -b; //используем сначала старое значение а=9, т.к. декремент использ. как постфикс (уже а=8)
        System.out.println(d); //9-5=4

        int e = --a - b; //а после предыдущей операции стало 8 и теперь перед операцией уменьшаем еще на 1
        System.out.println(e); //(8-1)-=2
    }
}
