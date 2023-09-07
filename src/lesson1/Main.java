package lesson1;

public class Main {
    //другие примеры работы
    public static void main(String[] args) {
    /*посчитать  количество часов в году
    узнать, является числов четным, или нечетным
     */
        int h = 24; // число часов в сутках
        int d = 30; // среднее число ней в месяце
        int m = 24; //число месяцев
        int sum = h * d * m; //сумммарное колчество часов в году
        int ch = sum % 2; //проверка на четность
        if (ch == 0)
            System.out.println("Чет");
        else System.out.println("Нечет");

        System.out.println(sum);
    }
};