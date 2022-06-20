package lesson3.hw1;

import java.util.Random;
import java.util.Scanner;

/**Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
 * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
 * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
public class Main {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static int waitUser;

    public static void main(String[] args) {
        userNumber();
    }

    private static void userNumber()  {
        int num = random.nextInt(9); //Получили случайное число от 0 до 9
        System.out.println("Введите Ваше число:");
        int userNum;
        int stop = 4;
        do {
            System.out.println("Осталось: " + stop + " попытки");
            boolean win = false;
            for (int i = 0; i < stop; i++) {
                userNum = sc.nextInt();
                if (userNum == num) {
                    System.out.println("Победа! Ура");
                    win = true;
                    break;
                } else if (userNum > num) {
                    System.out.println("Введенное число больше");
                } else {
                    System.out.println("Введенное число меньше");
                }
            }
            if (win){
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            } else {
                System.out.println("Вы проиграли! Правильный ответ " + num);
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            }
            waitUser = sc.nextInt();
        } while (waitUser == 1);
        System.out.println("Пока");
    }
}