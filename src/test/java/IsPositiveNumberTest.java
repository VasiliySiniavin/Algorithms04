import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
    @Order(1)
    @Test
    public void isPositiveNumberAlgorithmHappyPathPositiveNumber() {
        //    Test Data: 555
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void isPositiveNumberAlgorithmHappyPathPositiveZero() {
        //    Test Data: 0
        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void isPositiveNumberAlgorithmHappyPathNegativeNumber() {
        //    Test Data: -555
        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void isPositiveNumberAlgorithmHappyPathNegativeMinusZero() {
        //    Test Data: 0
        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void isPositiveNumberAlgorithmHappyPathNegativeMinusOne() {
        //    Test Data: -1
        int a = -1;
        boolean expectedResult = false;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(6)
    @Test
    public void isPositiveNumberAlgorithmHappyPathPositiveOne() {
        //    Test Data: 1
        int a = 1;
        boolean expectedResult = true;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(7)
    @Test
    public void isPositiveNumberAlgorithmHappyPathPositiveMaxInteger() {
        //    Test Data: Integer.MAX_VALUE
        int a = Integer.MAX_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(8)
    @Test
    public void isPositiveNumberAlgorithmHappyPathNegativeMinInteger() {
        //    Test Data: Integer.MIN_VALUE
        int a = Integer.MIN_VALUE;
        boolean expectedResult = false;

        IsPositiveNumber as = new IsPositiveNumber();
        boolean actualResult = as.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
