public class AreNumbersEqual {
    //Task 6. Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
    //0, если числа равны. -1, если первое число меньше второго. 1, если первое число больше второго

    public static int areNumbersEqualAlgorithm(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a < b) {
            return -1;
        } else {
        return 1;
    }
}

    public static void main(String[] args) {
        System.out.println(areNumbersEqualAlgorithm(89, 89 ));
        System.out.println(areNumbersEqualAlgorithm(-89, 89 ));
        System.out.println(areNumbersEqualAlgorithm(89, -89 ));
    }
}
