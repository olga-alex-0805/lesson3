

    import java.util.Arrays;
import java.util.Scanner;

    public class Lesson3 {
        public static void main(String[] args) {
            int[] array = new int[5];
            Scanner scanner = new Scanner(System.in);
            int i = 0;
            while (i < 5) {
                System.out.println("Enter " + (i + 1) + " integer: ");
                array[i] = scanner.nextInt();
                i++;
            }

            int[] array1 = Arrays.copyOfRange(array, 0, 5);
            Arrays.sort(array1);
            System.out.println("Числа массива: " + Arrays.toString(array1));

        }
    }
// я не знаю, как из введенных чисел найти минимальное и максимальное число в массиве










