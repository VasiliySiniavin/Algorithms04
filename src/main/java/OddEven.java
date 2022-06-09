import java.sql.SQLOutput;

public class OddEven {
    //Task 1.Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
// если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
// Test Data: -345 →  "Odd". 0 →  "Even". 222222 →  "Even". 2147483647 + 1 →  "Undefined"
    public String oddEvenT1Algorithm(int a) {
//        if (a <= Integer.MAX_VALUE && a >= Integer.MIN_VALUE) {
//            int result = a;
//        for (int i = 0; i < a; i++) {
//        String a1 = "";
//        if (a >= Integer.MAX_VALUE || a >= Integer.MIN_VALUE) {
//            a1 = "Undefined";
//            if (a == Integer.MAX_VALUE) {
//                a = a + 1;
//            } else if (a == Integer.MIN_VALUE) {
//                a = a + -1;
//            } else if (a % 2 == 0) {
//                a1 = "Even";
//            } else if (a % 2 != 0) {
//                a1 = "Odd";
//            }
//            return a1;
//        }
//        return a1;
//    }
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";
        if (a <= Integer.MAX_VALUE && a >= Integer.MIN_VALUE) {
            if (a % 2 == 0) {
                return even;
            } else if (a % 2 != 0) {
                return odd;
            }
        }
        return undefined;
    }
}

