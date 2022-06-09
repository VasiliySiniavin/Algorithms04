public class PeakElement {
    //Написать алгоритм PeakElement, который принимает на вход массив целых чисел и возвращает значения пиковых
    // элементов (элементы, которые больше своих соседей).
    //Test Data: {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
    public int[] peakElementAlgorithm(int[] array) {
        int[] result = {};
        int count = 0;

        if (array[0] > array[1] || array[array.length - 1] > array[array.length - 2]) {
            count += 1;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                count++;
            }
        }
        result = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    result[count] = array[i];
                    count++;
                    i++;
                } else {
                    i++;
                }
            } else if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                result[count] = array[i];
                count++;
                i++;
            } else if (i == array.length - 1) {
                if (array[array.length - 1] > array[array.length - 2]) {
                    result[count] = array[array.length - 1];
                }
            }
        }
        return result;
    }
}



