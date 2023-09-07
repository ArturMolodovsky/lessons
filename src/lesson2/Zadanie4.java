package lesson2;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner inputA = new Scanner(System.in);
        int a = inputA.nextInt();

        System.out.println("Введите второе число");
        Scanner inputB = new Scanner(System.in);
        int b = inputB.nextInt();

        int sum = a + b;

        while (sum > 0) {
            if (sum % 3 == 0) {
                System.out.println("Это число: " + sum);
            }
            sum--; // Уменьшаем значение sum внутри цикла
        }
    }
}
