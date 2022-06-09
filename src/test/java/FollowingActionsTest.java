import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class FollowingActionsTest {
    @Order(1)
    @Test
    public void followingActionsAlgorithmHappyPathGoodNumber() {
        // Если M кратно 3 и 5, то верните "Хорошее число".
        //    //● Если M кратно только 3, а не 5, то верните "Неверное число".
        //    //● Если M кратно только 5, а не 3, то верните "Плохое число".
        //    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"
        int M = 15;
        String expectedResult = "Хорошее число";

        FollowingActions as = new FollowingActions();
        String actualResult = as.followingActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void followingActionsAlgorithmHappyPathWrongNumber() {
        // Если M кратно 3 и 5, то верните "Хорошее число".
        //    //● Если M кратно только 3, а не 5, то верните "Неверное число".
        //    //● Если M кратно только 5, а не 3, то верните "Плохое число".
        //    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"
        int M = 9;
        String expectedResult = "Неверное число";

        FollowingActions as = new FollowingActions();
        String actualResult = as.followingActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void followingActionsAlgorithmHappyPathBadNumber() {
        // Если M кратно 3 и 5, то верните "Хорошее число".
        //    //● Если M кратно только 3, а не 5, то верните "Неверное число".
        //    //● Если M кратно только 5, а не 3, то верните "Плохое число".
        //    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"
        int M = 10;
        String expectedResult = "Плохое число";

        FollowingActions as = new FollowingActions();
        String actualResult = as.followingActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void followingActionsAlgorithmHappyPathOtherwiseNumber() {
        // Если M кратно 3 и 5, то верните "Хорошее число".
        //    //● Если M кратно только 3, а не 5, то верните "Неверное число".
        //    //● Если M кратно только 5, а не 3, то верните "Плохое число".
        //    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"
        int M = 4;
        String expectedResult = "-1";

        FollowingActions as = new FollowingActions();
        String actualResult = as.followingActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void followingActionsAlgorithmHappyPathZeroNumber() {
        // Если M кратно 3 и 5, то верните "Хорошее число".
        //    //● Если M кратно только 3, а не 5, то верните "Неверное число".
        //    //● Если M кратно только 5, а не 3, то верните "Плохое число".
        //    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"
        int M = 0;
        String expectedResult = "Хорошее число";

        FollowingActions as = new FollowingActions();
        String actualResult = as.followingActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(6)
    @Test
    public void followingActionsAlgorithmHappyPathNegativeFifteenNumber() {
        // Если M кратно 3 и 5, то верните "Хорошее число".
        //    //● Если M кратно только 3, а не 5, то верните "Неверное число".
        //    //● Если M кратно только 5, а не 3, то верните "Плохое число".
        //    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"
        int M = -15;
        String expectedResult = "Хорошее число";

        FollowingActions as = new FollowingActions();
        String actualResult = as.followingActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(7)
    @Test
    public void followingActionsAlgorithmHappyPathNegativeNineNumber() {
        // Если M кратно 3 и 5, то верните "Хорошее число".
        //    //● Если M кратно только 3, а не 5, то верните "Неверное число".
        //    //● Если M кратно только 5, а не 3, то верните "Плохое число".
        //    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"
        int M = -9;
        String expectedResult = "Неверное число";

        FollowingActions as = new FollowingActions();
        String actualResult = as.followingActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(8)
    @Test
    public void followingActionsAlgorithmHappyPathNegativeTenNumber() {
        // Если M кратно 3 и 5, то верните "Хорошее число".
        //    //● Если M кратно только 3, а не 5, то верните "Неверное число".
        //    //● Если M кратно только 5, а не 3, то верните "Плохое число".
        //    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"
        int M = -10;
        String expectedResult = "Плохое число";

        FollowingActions as = new FollowingActions();
        String actualResult = as.followingActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(9)
    @Test
    public void followingActionsAlgorithmHappyPathNegativeFourNumber() {
        // Если M кратно 3 и 5, то верните "Хорошее число".
        //    //● Если M кратно только 3, а не 5, то верните "Неверное число".
        //    //● Если M кратно только 5, а не 3, то верните "Плохое число".
        //    //● Если M не удовлетворяет ни одному из вышеперечисленных условий, верните "-1"
        int M = -4;
        String expectedResult = "-1";

        FollowingActions as = new FollowingActions();
        String actualResult = as.followingActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
