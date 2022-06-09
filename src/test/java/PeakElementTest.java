import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PeakElementTest {

    @Order(1)
    @Test
    public void peakElementAlgorithmHappyPathPositive() {
        //Test Data: {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] array = new int[]{3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void peakElementAlgorithmHappyPathNegative() {
        //Test Data: {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] array = new int[]{3, 3, 3, 3, 3, 3, 3};
        int[] expectedResult = {};

        PeakElement as = new PeakElement();
        int[] actualResult = as.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}

