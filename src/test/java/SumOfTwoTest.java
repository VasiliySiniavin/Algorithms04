import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {
    @Order(1)
    @Test
    public void sumOfTwoRightAlgorithmHappyPathPositive() {
        // Test Data: ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo as = new SumOfTwo();
        int[][] actualResult = as.sumOfTwoAlgorithm(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
