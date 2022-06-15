package lesson2.hw1;
import java.util.Arrays;

/** Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0; */
public class Main {
    public static void main(String[] args) {
        printArrays(new int[]{1, 1, 1, 0, 1, 0, 0});
        arrOne(new int[]{1, 1, 1, 0, 1, 0, 0});
    }

    static void arrOne(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1){
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    static void printArrays(int[] arr1){
        System.out.println("Массив до изменений");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Массив после изменений");
    }
}
