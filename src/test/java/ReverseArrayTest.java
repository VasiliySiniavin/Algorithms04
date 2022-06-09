import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {
    @Order(1)
    @Test
    public void reverseArrayAlgorithmHappyPathPositve() {
        //Test Data: //{2, 7, 3, 10} → {10, 3, 7, 2}
        int[] array = new int[]{2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray as = new ReverseArray();
        int[] actualResult = as.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void reverseArrayAlgorithmHappyPathZero() {
        //Test Data: //{2, 7, 3, 10} → {10, 3, 7, 2}
        int[] array = new int[]{1, 1, 1, 1};
        int[] expectedResult = {1, 1, 1, 1};

        ReverseArray as = new ReverseArray();
        int[] actualResult = as.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void reverseArrayAlgorithmHappyPathNegative() {
        //Test Data: //{2, 7, 3, 10} → {10, 3, 7, 2}
        int[] array = new int[]{-1, -6, -2, -4, -8, -9, -12, -14};
        int[] expectedResult = {-14, -12, -9, -8, -4, -2, -6, -1};

        ReverseArray as = new ReverseArray();
        int[] actualResult = as.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
