package lesson2.hw5;

/**** ������ ���������� ������ � ����� � ��� ����������� � ������������ �������� (��� ������ ���������);*/
public class Main {
    public static void main(String[] args) {
        arrFive(new int[]{-1, 3, 7, 5, 8, 2});
    }
    static void arrFive(int[] arr5){
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max){
                max = arr5[i];
            } else if (arr5[i]< min) {
                min = arr5[i];
            }
        }
        System.out.println("Максимальное значение : " + max + " "+ "Минимальное значение: " + min);
    }
}
