package lesson2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        String month;
        System.out.println("Введите название месяца");
        Scanner inputMonth = new Scanner(System.in);
        month = inputMonth.next();
        switch (month) {
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.println("Зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Опечатка!");
        }
    }
}
