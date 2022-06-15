package lesson2.hw2;

import java.util.Arrays;

/** Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
 значениями 0 3 6 9 12 15 18 21; */
public class Main {
    public static void main(String[] args) {
        arrTwo(new int[8]);
    }

    static void arrTwo(int[] arr2){
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
