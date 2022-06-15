package lesson2.hw6;

/** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
 * checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.*/
public class Main {
    public static void main(String[] args) {
        arrSix(new  int[]{1, 1, 1, 1, 2});
    }

    static boolean arrSix(int[] arr6){
        int arrSum = 0;
        int rightSum = 0;

        for (int i: arr6) {
            arrSum += i;
        }

        for (int i = 0; i < arr6.length; i++)
        {
            // добавляем текущее значение в сумму правой части
            rightSum += arr6[i];

            // вычитаем из суммы всего массива, сумму текущей правой части,
            // и если они равны, значит баланс найден.
            if (rightSum == arrSum - rightSum){
                return true;
            }
         }
        return false;
    }
}
