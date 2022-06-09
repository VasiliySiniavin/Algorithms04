import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SumArrayTest {

        @Order(1)
        @Test
        public void sumArrayAlgorithmHappyPathPositive() {
        // Test Data: {0, 1, 2, 3, 4, 5} → 15. {-7, -3} → -10
            int [] array = {0, 1, 2, 3, 4, 5};
            int expectedResult = 15;

            SumArray as = new SumArray();
            int actualResult = as.sumArrayAlgorithm(array);

            Assertions.assertEquals(expectedResult, actualResult);
        }
    @Order(2)
    @Test
    public void sumArrayAlgorithmHappyPathPositiveTwo() {
        // Test Data: {-7, -3} → -10
        int [] array = {-7, -3};
        int expectedResult = -10;

        SumArray as = new SumArray();
        int actualResult = as.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void sumArrayAlgorithmHappyPathNegativeNumber() {
        // Test Data: {-7, -3} → -10
        int [] array = {-7, 34142};
        int expectedResult = 34135;

        SumArray as = new SumArray();
        int actualResult = as.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    public void sumArrayAlgorithmHappyPathPositiveNumber() {
        // Test Data: {-7, -3} → -10
        int [] array = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int expectedResult = -1;

        SumArray as = new SumArray();
        int actualResult = as.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
