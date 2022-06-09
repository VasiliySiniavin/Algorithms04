import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {
    @Order(1)
    @Test
    public void areNumbersEqualAlgorithmHappyPathPositiveZero() {
        // Test Data: 89, 89 Expected result: 0 \/ -89, 89 Expected result: -1 \/ 89, -89 Expected result: 1
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void areNumbersEqualAlgorithmHappyPathNegativeNumber() {
        // Test Data: 89, 89 Expected result: 0 \/ -89, 89 Expected result: -1 \/ 89, -89 Expected result: 1
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void areNumbersEqualAlgorithmHappyPathPositiveNumber() {
        // Test Data: 89, 89 Expected result: 0 \/ -89, 89 Expected result: -1 \/ 89, -89 Expected result: 1
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void areNumbersEqualAlgorithmHappyPathNegativeZeroNumber() {
        // Test Data: 89, 89 Expected result: 0 \/ -89, 89 Expected result: -1 \/ 89, -89 Expected result: 1
        int a = -0;
        int b = 0;
        int expectedResult = 0;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void areNumbersEqualAlgorithmHappyPathPositiveMaxValue() {
        // Test Data: 89, 89 Expected result: 0 \/ -89, 89 Expected result: -1 \/ 89, -89 Expected result: 1
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int expectedResult = 0;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(6)
    @Test
    public void areNumbersEqualAlgorithmHappyPathNegativeMinValue() {
        // Test Data: 89, 89 Expected result: 0 \/ -89, 89 Expected result: -1 \/ 89, -89 Expected result: 1
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int expectedResult = 0;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(7)
    @Test
    public void areNumbersEqualAlgorithmHappyPathPositiveMinOrMaxValue() {
        // Test Data: 89, 89 Expected result: 0 \/ -89, 89 Expected result: -1 \/ 89, -89 Expected result: 1
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        int expectedResult = -1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(8)
    @Test
    public void areNumbersEqualAlgorithmHappyPathPositiveMaxOrMinValue() {
        // Test Data: 89, 89 Expected result: 0 \/ -89, 89 Expected result: -1 \/ 89, -89 Expected result: 1
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int expectedResult = 1;

        AreNumbersEqual as = new AreNumbersEqual();
        int actualResult = as.areNumbersEqualAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
