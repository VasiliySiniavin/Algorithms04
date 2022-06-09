import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NumberOccurrencesTest {
    @Order(1)
    @Test
    public void numberOccurrencesAlgorithmHappyPathPositive() {
        // Test Data: {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} → {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurrences as = new NumberOccurrences();
        int[][] actualResult = as.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
