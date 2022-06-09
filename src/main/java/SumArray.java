public class SumArray {
//Task 3. Написать алгоритм SumArray, который возвращает сумму всех чисел массива
// Test Data: {0, 1, 2, 3, 4, 5} → 15. {-7, -3} → -10

    public int sumArrayAlgorithm(int[] array) {
        if (array.length == 0) {

            return 0;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}

