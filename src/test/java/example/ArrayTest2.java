package example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ArrayTest2 {

    @ParameterizedTest
    @MethodSource("arrayAndNumberProvider")
    void testArrayContainsNumber(int[] array, int number) {
        assertTrue(arrayContainsNumber(array, number), "Array should contain the number");
    }

    @ParameterizedTest
    @MethodSource("arrayAndNonexistentNumberProvider")
    void testArrayDoesNotContainNumber(int[] array, int number) {
        assertFalse(arrayContainsNumber(array, number), "Array should not contain the number");
    }

    private static Object[][] arrayAndNumberProvider() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 3},
                {new int[]{5, 8, 12, 7, 9}, 7},
                {new int[]{10, 20, 30, 40, 50}, 40}
        };
    }

    private static Object[][] arrayAndNonexistentNumberProvider() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 6},
                {new int[]{5, 8, 12, 7, 9}, 15},
                {new int[]{10, 20, 30, 40, 50}, 60}
        };
    }

    private static boolean arrayContainsNumber(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
