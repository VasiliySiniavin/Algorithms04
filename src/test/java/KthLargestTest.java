import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class KthLargestTest {
    @Order(1)
    @Test
    public void kthLargestAlgorithmHappyPathPositive() {
        //Test Data: ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest as = new KthLargest();
        int actualResult = as.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
