package lesson2;

import java.util.Scanner;

public class Zadanie1a {
    public static void main(String[] args) {
        String lit;
        System.out.println("Введите английску букву");
        Scanner inputLit = new Scanner(System.in);
        lit = inputLit.next();
        switch (lit){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "Y":
                System.out.println("Гласная");
                break;
            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "R":
            case "S":
            case "T":
            case "V":
            case "W":
            case "X":
            case "Z":
                System.out.println("Согласная");
                break;
            default:
                System.out.println("Не буква");




        }
            }
}
/*

 */