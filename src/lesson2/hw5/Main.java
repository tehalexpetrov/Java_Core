package lesson2.hw5;

/**** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);*/
public class Main {
    public static void main(String[] args) {
        arrFive(new int[]{1, 3, 7, 5, 8, 2});
    }
    static void arrFive(int[] arr5){
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
            if (arr5[i] > arr5[max]){
                max = i;
            } else if (arr5[i]< arr5[min]) {
                min = i;
            }
        }
        System.out.println(max + " " + min);
    }
}
