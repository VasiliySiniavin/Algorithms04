import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IntersectionTest {
    @Order(1)
    @Test
    public void intersectionAlgorithmHappyPathPositive() {
        //Test Data: {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
        //{1, 2, 4, 5, 89}, {8, 9, 45} → {}
        int [] array1 = {1, 2, 4, 5, 89};
        int [] array2 = {8, 9, 4, 2};

        int[] expectedResult = {2, 4};

        Intersection as = new Intersection();
        int [] actualResult = as.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void intersectionAlgorithmHappyPathPositiveTwo() {
        //Test Data: {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
        //{1, 2, 4, 5, 89}, {8, 9, 45} → {}
        int [] array1 = {1, 2, 4, 5, 8, 9};
        int [] array2 = {8, 9, -4, -2};

        int[] expectedResult = {8, 9};

        Intersection as = new Intersection();
        int [] actualResult = as.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void intersectionAlgorithmHappyPathPositiveThree() {
        //Test Data: {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
        //{1, 2, 4, 5, 89}, {8, 9, 45} → {}
        int [] array1 = {1, 2, 4, 5, 89};
        int [] array2 = {8, 9, 45};

        int[] expectedResult = {};

        Intersection as = new Intersection();
        int [] actualResult = as.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
