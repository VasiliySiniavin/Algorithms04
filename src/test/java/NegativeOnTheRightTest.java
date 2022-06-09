import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeOnTheRightTest {
    @Order(1)
    @Test
    public void negativeOnTheRightAlgorithmHappyPathPositive() {
        // Test Data: {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        NegativeOnTheRight as = new NegativeOnTheRight();
        int[] actualResult = as.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void negativeOnTheRightAlgorithmHappyPathNegative() {
        // Test Data: {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
        int[] array = {-4, 3, -7, -12, -5, -2, -9, -1, -12};
        int[] expectedResult = {3, -12, -1, -9, -2, -5, -12, -7, -4};

        NegativeOnTheRight as = new NegativeOnTheRight();
        int[] actualResult = as.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void negativeOnTheRightAlgorithmHappyPathNegativeZero() {
        // Test Data: {4, 3, 7, 12, 5, 2, 0, 1, 1} → {4, 3, 7, 12, 5, 2, 1, 12, 0}
        int[] array = {4, 3, 7, 12, 5, 2, 0, 1, 12};
        int[] expectedResult = {4, 3, 7, 12, 5, 2, 1, 12, 0};

        NegativeOnTheRight as = new NegativeOnTheRight();
        int[] actualResult = as.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void negativeOnTheRightAlgorithmHappyPathNegativeTwo() {
        // Test Data: {-4, -3, -7, -12, -5, -2, -6, -1, -12} → {-12, -1, -6, -2, -5, -12, -7, -3, -4}
        int[] array = {-4, -3, -7, -12, -5, -2, -6, -1, -12};
        int[] expectedResult = {-12, -1, -6, -2, -5, -12, -7, -3, -4};

        NegativeOnTheRight as = new NegativeOnTheRight();
        int[] actualResult = as.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
        }
