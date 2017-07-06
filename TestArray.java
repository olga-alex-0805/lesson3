
public class TestArray {
    public static void main(String[] args) {

            double[] myList = {1.2, 4.9, 6.3, 2.9, 5.6};

        // Вывожу на экран все элементы массива
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        // Сумма элементов массива
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Сумма чисел массива: " + total);
        // Наибольшее число массива
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Наибольший элемент: " + max);

        // Наименьшее число массива
        double min = myList[0];
        for (int i = 1; i > myList.length; i--) {
            if (myList[i] < min) min = myList[i];
        }
        System.out.println("Наименьший элемент: " + min );
    }


}
