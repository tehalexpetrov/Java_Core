package lesson3;

import java.util.Random;
import java.util.Scanner;

public class MyVersionHW3 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
//        game();
        guessWord();
    }

    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int secret = random.nextInt(words.length);
        System.out.println(words[secret]);
        System.out.println("input guessWord. ");

        while (true) {
            System.out.println("input word ");
            String answer = sc.nextLine();

            if (answer.equals(words[secret])) {
                System.out.println("yes");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < words[secret].length() && i < answer.length()
                            && words[secret].charAt(i) == answer.charAt(i)) {
                        System.out.println(answer.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
            }
        }
        System.out.println("You guess, secret word " + words[secret]);
    }


    public static void game() {
        int answer;
        int max = 10;
        do {
            int secret = random.nextInt(max);
            boolean guess = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("Please enter a number between 0 and " + (max - 1));
                System.out.println("attempt :" + (3 - i));

                int userNumber = sc.nextInt();
                if (userNumber > secret) {
                    System.out.println("userNumber > secret");
                }
                if (userNumber < secret) {
                    System.out.println("userNumber < secret");
                }
                if (userNumber == secret) {
                    guess = true;
                    break;
                }
            }
            if (guess) {
                System.out.println("You guess! Secret Number = " + secret);
            } else {
                System.out.println("You can not guess! Secret Number =" + secret);
            }
            System.out.println("Repeat? 1 -yes");
            answer = sc.nextInt();
        } while (answer == 1);
        System.out.println("Good bye!");
    }

    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
