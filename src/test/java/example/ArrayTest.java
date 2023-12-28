package example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import s3.Array;

public class ArrayTest {
    @Test
    public void testArraySize() {
        int[] array = Array.createArray();
        assertEquals(5, array.length);
    }
    @Test
    public void testFirstElement() {
        int[] array = Array.createArray();
        assertEquals(1, array[0]);
    }

    @Test
    public void testArrayContent() {
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = Array.createArray();
        assertArrayEquals(expectedArray, actualArray, "Arrays should be equal");
    }


}

