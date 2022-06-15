package lesson2.hw7;

import java.util.Arrays;

/**Написать метод, которому на вход подается одномерный массив
 и число n (может быть положительным, или отрицательным),
  при этом метод должен сместить все элементы массива на n позиций.
  Для усложнения задачи нельзя пользоваться вспомогательными массивами.*/
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(shiftArr(arr, -1)));
    }

    public static int[] shiftArr(int[] arr, int n) {
        int k = n % arr.length + arr.length;
        for (int i = 0; i < k; i++) {
            int tmp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = tmp;
        }
        return arr;
    }
}
