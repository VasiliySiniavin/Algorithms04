import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    @Order(1)
    @Test
    public void oddEvenT1AlgorithmHappyPathNegativeNumber() {
        // Test Data: -345 →  "Odd". 0 →  "Even". 222222 →  "Even". 2147483647 + 1 →  "Undefined"
        int a = -345;

        String expectedResult = "Odd";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenT1Algorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void oddEvenT1AlgorithmHappyPathZeroNumber() {
        // Test Data: -345 →  "Odd". 0 →  "Even". 222222 →  "Even". 2147483647 + 1 →  "Undefined"
        int a = 0;

        String expectedResult = "Even";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenT1Algorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void oddEvenT1AlgorithmHappyPathPositiveNumber() {
        // Test Data: -345 →  "Odd". 0 →  "Even". 222222 →  "Even". 2147483647 + 1 →  "Undefined"
        int a = 222222;

        String expectedResult = "Even";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenT1Algorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void oddEvenT1AlgorithmHappyPathNegativeMaxIntegerNumber() {
        // Test Data: -345 →  "Odd". 0 →  "Even". 222222 →  "Even". 2147483647 + 1 →  "Undefined"
        int a = 2147483647 + 1;

        String expectedResult = "Undefined";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenT1Algorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void oddEvenT1AlgorithmHappyPathNegativeMinIntegerNumber() {
        // Test Data: -345 →  "Odd". 0 →  "Even". 222222 →  "Even". 2147483647 + 1 →  "Undefined"
        int a = -2147483648 + -1;

        String expectedResult = "Undefined";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenT1Algorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(6)
    @Test
    public void oddEvenT1AlgorithmHappyPathPositiveMaxIntegerDivide() {
        // Test Data: -345 →  "Odd". 0 →  "Even". 222222 →  "Even". 2147483647 + 1 →  "Undefined"
        int a = 2147483647 / 14;

        String expectedResult = "Undefined";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenT1Algorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(7)
    @Test
    public void oddEvenT1AlgorithmHappyPathNegativeMinIntegerDivide() {
        // Test Data: -345 →  "Odd". 0 →  "Even". 222222 →  "Even". 2147483647 + 1 →  "Undefined"
        int a = -2147483648 / 10;

        String expectedResult = "Undefined";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenT1Algorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(8)
    @Test
    public void oddEvenT1AlgorithmHappyPathNegativeMinIntegerMulti() {
        // Test Data: -345 →  "Odd". 0 →  "Even". 222222 →  "Even". 2147483647 + 1 →  "Undefined"
        int a = -2147483648 * -12;

        String expectedResult = "Undefined";

        OddEven as = new OddEven();
        String actualResult = as.oddEvenT1Algorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}


