package lesson2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        String lit;
        System.out.println("Введите английску букву");
        Scanner inputLit = new Scanner(System.in);
        lit = inputLit.next();
        if (lit.equals("A") || lit.equals("E") || lit.equals("I")|| lit.equals("O")|| lit.equals("U") || lit.equals("Y"))
            System.out.println("Гласная");

        else if (lit.equals("B") || lit.equals("C") || lit.equals("D") || lit.equals("F") || lit.equals("F")||lit.equals("H")||
                lit.equals("J") || lit.equals("K") || lit.equals("L") || lit.equals("V")||lit.equals("N")
                || lit.equals("P") || lit.equals("Q") || lit.equals("R") || lit.equals("S")||lit.equals("T")
                || lit.equals("V") || lit.equals("W") || lit.equals("X") || lit.equals("Z"))
            System.out.println("Согласная");
        else {
            System.out.println("Не буква");

        }

    }
}
/*
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner inputLit = new Scanner(System.in);
        System.out.println("Введите английскую букву");
        String lit = inputLit.next().toUpperCase(); // Преобразуем к верхнему регистру для упрощения сравнения

        if ("AEIOUY".contains(lit)) {
            System.out.println("Гласная");
        } else if ("BCDFGHJKLMNPQRSTVWXZ".contains(lit)) {
            System.out.println("Согласная");
        } else {
            System.out.println("Не буква");
        }
    }
}
 */