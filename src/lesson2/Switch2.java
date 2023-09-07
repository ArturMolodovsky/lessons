package lesson2;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        String day;
        System.out.println("Введите день недели");
        Scanner inputDay = new Scanner(System.in);
        day = inputDay.next();
        switch ("piatnica") {
            case "ponedelnik":
            case "vtornik":
            case "sreda":
            case "chetverg":
            case "piatnica":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenie":
                System.out.println("Vyhodnoi");
            default:
                System.out.println("No data");
        }
    }
}
