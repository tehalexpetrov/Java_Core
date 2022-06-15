package lesson2.hw4;

import java.util.Arrays;

/**Создать квадратный двумерный целочисленный массив (количество строк и столбцов
 одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
public class Main {
    public static void main(String[] args) {
        arrFour(new int[6][6]);
    }
    static void arrFour(int[][] arr4){
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][i] = 1;
                arr4[i] [arr4.length - i - 1] = 1;
                System.out.printf("%4d",arr4[i][j]);
            }
            System.out.println();
        }
    }
}
