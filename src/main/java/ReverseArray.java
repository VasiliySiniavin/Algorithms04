import java.util.Arrays;

public class ReverseArray {
    //Task 11.	 Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
//Test Data: //{2, 7, 3, 10} → {10, 3, 7, 2}
    public int[] reverseArrayAlgorithm(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}
