import java.util.Arrays;

public class Intersection {
    //Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
    // Test Data: {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    //{1, 2, 4, 5, 89}, {8, 9, 45} → {}

    public int[] intersectionAlgorithm(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    array1[j] = Integer.MIN_VALUE;

                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i] == array2[j]) {
                    array2[j] = Integer.MIN_VALUE;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i] && array1[i] != Integer.MIN_VALUE && array2[j] != Integer.MIN_VALUE) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {

            return new int[]{};

        } else {
            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++ ) {
                    if (array2[j] == array1[i] && array1[i] != Integer.MIN_VALUE && array2[j] != Integer.MIN_VALUE) {
                        result[count] = array1[i];
                        count++;
                        break;
                    }
                }
            }
            return result;
        }
    }
}