import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

    public class OddIndicesTest {

        @Order(1)
        @Test
        public void oddIndicesAlgorithmHappyPathPositive() {
        // Test Data: Input = {-45, 590, 234, 985, 12, 68} Expected Result =  {590, 985, 68}
            int [] array = {-45, 590, 234, 985, 12, 68};

            int[] expectedResult = {590, 985, 68};

            OddIndices as = new OddIndices();
            int[] actualResult = as.oddIndicesAlgorithm(array);

            Assertions.assertArrayEquals(expectedResult, actualResult);
        }
    @Order(2)
    @Test
    public void oddIndicesAlgorithmHappyPathPositiveTwo() {
        // Test Data: Input = {-45, 590, 234, 985, 12, 68} Expected Result =  {590, 985, 68}
        int[] array = {-45, 590, 234, 985, 12, 68, 564, 49, 15, 48, 96, 47, 55, 99, 153, 472, 325};

        int[] expectedResult = {590, 985, 68, 49, 48, 47, 99, 472};

        OddIndices as = new OddIndices();
        int[] actualResult = as.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void oddIndicesAlgorithmHappyPathNegativeTwo() {
        // Test Data: Input = {-45, 590, 234, 985, 12, 68} Expected Result =  {590, 985, 68}
        int[] array = {-45, -0, -854, -62985, -12, -868, -5644, -449, -415, -548, -96, -47, -55, -99, -153, -472, -325};

        int[] expectedResult = {-0, -62985, -868, -449, -548, -47, -99, -472};

        OddIndices as = new OddIndices();
        int[] actualResult = as.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    public void oddIndicesAlgorithmHappyPathNegativeThree() {
        // Test Data: Input = {-45, 590, 234, 985, 12, 68} Expected Result =  {590, 985, 68}
        int[] array = {+45, +65945217, +5421854, +62985, +12, +868, +5644, +449, +415, +548, +96, +47, +55, +99, +153, +472};

        int[] expectedResult = {+65945217, +62985, +868, +449, +548, +47, +99, +472};

        OddIndices as = new OddIndices();
        int[] actualResult = as.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
