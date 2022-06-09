import java.util.Arrays;

public class OddIndices {
    //Task 2. Написать алгоритм OddIndices, который принимает массив чисел, и возвращает массив значений нечетных индексов
    //Test Data: Input = {-45, 590, 234, 985, 12, 68} Expected Result =  {590, 985, 68}

    public int[] oddIndicesAlgorithm(int[] array) {
//        int i1[] = new int[array.length];
//        int j = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                i1[j] = array[i];
//                j++;
//            }
//        }
//        return Arrays.copyOf(i1, j);

//вариант 2
        if (array.length != 0) {
            int j = 0;
            int[] array1 = new int[array.length / 2];
            for (int i = 1; i < array.length; i+=2) {
 //               if (i % 2 != 0) {
                    array1[j] = array[i];
                    j++;
 //               }
            }
            return array1;
        }
        return new int[]{};
    }
}