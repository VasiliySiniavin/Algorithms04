public class FollowingActions {
    //Task 7. Учитывая целое число M, выполните следующие условные действия:
    //● Если M кратно 3 и 5, то верните "Хорошее число".
    //● Если M кратно только 3, а не 5, то верните "Неверное число".
    //● Если M кратно только 5, а не 3, то верните "Плохое число".
    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"

    public String followingActionsAlgorithm(int M) {
        if (M % 3 == 0 && M % 5 == 0) {
            return "Хорошее число";
        } else if (M % 3 == 0 && M % 5 != 0) {
            return "Неверное число";
        } else if (M % 5 == 0 && M % 3 != 0) {
            return "Плохое число";
        } else {
            return "-1";
        }
    }
}

