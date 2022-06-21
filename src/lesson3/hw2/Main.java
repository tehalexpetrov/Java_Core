package lesson3.hw2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать массив из слов
 * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
 */
public class Main {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr;
        {
            arr = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        }

        arrPrint(arr);
    }

    private static void arrPrint(String[] arr) {

        while (true) {
            int word = random.nextInt(arr.length); // случайоное слово из массива
            System.out.println(arr[word]);
            System.out.println("Введите слово");
            String userAnswer = sc.nextLine();

            if (userAnswer.equals(arr[word])) {
                System.out.println("Правильно");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < arr[word].length() && i < userAnswer.length() && arr[word].charAt(i) == userAnswer.charAt(i)) {
                        System.out.println(userAnswer.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
            }
            System.out.println("You guess, secret word " + arr[word]);
        }
    }
}
