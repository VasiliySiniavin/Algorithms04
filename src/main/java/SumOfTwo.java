import java.util.Arrays;

public class SumOfTwo {
    //Task 15.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел, и число n.
    // Алгоритм  возвращает пары элементов, которые в сумме дают число n.
    //Test Data: ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
    public static int[][] sumOfTwoAlgorithm(int[] array, int n) {
        if (array.length > 0) {


            int[] array2 = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (n == (array[i] + array2[j])) {
                        count++;
                        array[i] = -2147483648;
                    }
                }
            }
            int[][] result = new int[count][2];

            count = 0;
            for (int i = 0; i < array2.length; i++) {
                for (int j = i + 1; j < array2.length; j++) {
                    if (n == array2[i] + array2[j]) {
                        result[count][0] = array2[i];
                        result[count][1] = array2[j];
                        count++;
                        array2[i] = -2147483648;
                    }
                }
            }
            return result;
        }
        return new int[][]{};
    }
}
//    public static void main(String[] args) {
//        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
//        int n = 12;
//        System.out.println(Arrays.toString(sumOfTwoAlgorithm(array, n)));
//    }
//}