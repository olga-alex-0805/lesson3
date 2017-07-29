import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива : ");
        int arraySize = scan.nextInt();
        scan.nextLine();
        int[] A = new int[arraySize];
        for (int i = 0; i < A.length; i++){
            System.out.printf("A[%d] = ", i);
            A[i] = scan.nextInt();
            scan.nextLine();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num5 = 0;
        for(int val : A) {
            if (val > max)
                max = val;
            if (val < min)
                min = val;
            if (val == 5)
                num5++;
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Число повторений числа" +" "+ "5: " + num5);

       int rf = 1;
        while (rf > 0) {
            rf = 0;
             for (int i = 0; i < (A.length - 1); i++){
                if(A[i] > A[i + 1]) {
                    int g = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = g;
                    rf++;
                }
            }
        }
        System.out.print("Массив после сортировки : ");
        for(int l : A){
            System.out.print(l);
                  }
    }
}