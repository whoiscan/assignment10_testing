package miu.edu.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ArrayFlattenerTest {
    @Test
    public void testFlattenArrayWithValidInput() {
        int[][] arr = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedArr = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expectedArr, ArrayFlattener.flattenArray(arr));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        assertNull(ArrayFlattener.flattenArray(null));
    }
}
