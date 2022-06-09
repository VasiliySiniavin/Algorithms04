public class BiggerValue {
    //Task 4.Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
//  Test Data: 3333, 9999. Expected Result = 9999

    public int biggerValueAlgorithm(int a, int b) {
        if (a == b) {
            return a - b;
        }
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
