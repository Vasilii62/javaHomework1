import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*  Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
public class Main {

    /*   public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }

            System.out.println( Arrays.toString( arr1 ) );
        }
    }  */
     public static void main() {
         main( null );
     }

    /*   public static void main(String[] args) {
            int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == 1) {
                    arr1[i] = 0;
                } else {
                    arr1[i] = 1;
                }

                System.out.println( Arrays.toString( arr1 ) );
            }
        }  */

    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     /*  public static void main(String[] args) {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
        }

        System.out.println( Arrays.toString(arr3) );
    }  */

    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/

    /*  public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }  */


    public static void main(String[] args)
    {
        Integer[] numbers = { 2, 6, 4, 8, 3, 5, 1, 9 };

        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }


}
