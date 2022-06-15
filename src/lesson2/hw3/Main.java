package lesson2.hw3;

import java.util.Arrays;

/**Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
 умножить на 2*/
public class Main {
    public static void main(String[] args) {
        arrThree(new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
    }
    private static void arrThree(int[] arr3){
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6 ){
                arr3[i] = i * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
