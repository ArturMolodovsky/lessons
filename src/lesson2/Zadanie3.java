package lesson2;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("Напишите слово");
        Scanner inputWord = new Scanner(System.in);
        String word = inputWord.nextLine();
        while (true){
            System.out.println("Напите слово");
            word = inputWord.nextLine();
            if (word.equalsIgnoreCase("exit")){
                System.out.println("Завершено");
                break;
            }
        }

    }
}
