import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] myList = new int[] { 7, 1, 5, 0, 5, 2, 8, 3, 5, 6, 1, 4};
        int[] counter = new int[12];

        for (int i = 0; i < myList.length; i++) {
            counter[myList[i]]++;
        }
//не могу посчитать кол-во повторений только числа 5, как убрать хвост чисел?
        System.out.println("value\tcount");
        for (int i = 5; i < counter.length; i++){
            System.out.println(i + "\t" + counter[i]);

        }
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        // Сумма элементов массива
        int total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Сумма чисел массива: " + total);
        // Наибольшее число массива
        int max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Наибольший элемент: " + max);

        // Наименьшее число массива
        int min = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min) min = myList[i];
        }
        System.out.println("Наименьший элемент: " + min );
    }


}
