import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Order(1)
    @Test
    public void biggerValueAlgorithmHappyPathPositive() {
    //    Test Data: 3333, 9999. Expected Result = 9999
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void biggerValueAlgorithmHappyPathNegative() {
        //    Test Data: 9998, 9999. Expected Result = 9999
        int a = 9998;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void biggerValueAlgorithmHappyPathNegativeNumber() {
        //    Test Data: -3333, -3332. Expected Result = -3332
        int a = -3333;
        int b = -3332;
        int expectedResult = -3332;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void biggerValueAlgorithmHappyPathNegativeZero() {
        //    Test Data: 0, -0. Expected Result = -0
        int a = 0;
        int b = -0;
        int expectedResult = -0;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void biggerValueAlgorithmHappyPathNegativePositive() {
        //    Test Data: -1, 1. Expected Result = 1
        int a = -1;
        int b = 1;
        int expectedResult = 1;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(6)
    @Test
    public void biggerValueAlgorithmHappyPathNegativeSix() {
        //    Test Data: 0, 0. Expected Result = 0
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue as = new BiggerValue();
        int actualResult = as.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
