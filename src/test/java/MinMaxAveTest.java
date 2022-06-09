import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
    @Order(1)
    @Test
    public void minMaxAveAlgorithmHappyPathGoodNumber() {
    //Test Data: ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve as = new MinMaxAve();
        int [] actualResult = MinMaxAve.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void minMaxAveAlgorithmHappyPathPoolNumber() {
        //Test Data: ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -2;
        int index2 = 6;
        int[] expectedResult = new int[]{};

        MinMaxAve as = new MinMaxAve();
        int [] actualResult = MinMaxAve.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void minMaxAveAlgorithmHappyPathNegativeNumber() {
        //Test Data: ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -2;
        int index2 = -6;
        int[] expectedResult = new int[]{};

        MinMaxAve as = new MinMaxAve();
        int [] actualResult = MinMaxAve.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void minMaxAveAlgorithmHappyPathZeroNumber() {
        //Test Data: ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int [] array = {0, 0, 0, 0};
        int index1 = -0;
        int index2 = 0;
        int[] expectedResult = new int[]{};

        MinMaxAve as = new MinMaxAve();
        int [] actualResult = MinMaxAve.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(5)
    @Test
    public void minMaxAveAlgorithmHappyPathThreeNumber() {
        //Test Data: ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int [] array = {2, 5, 6};
        int index1 = 1;
        int index2 = 3;
        int[] expectedResult = new int[]{};

        MinMaxAve as = new MinMaxAve();
        int [] actualResult = MinMaxAve.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(6)
    @Test
    public void minMaxAveAlgorithmHappyPathThreeNumberZero() {
        //Test Data: ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int [] array = {2, 6};
        int index1 = -1;
        int index2 = 3;
        int[] expectedResult = new int[]{};

        MinMaxAve as = new MinMaxAve();
        int [] actualResult = MinMaxAve.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
