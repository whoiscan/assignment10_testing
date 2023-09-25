package miu.edu.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class ArrayReverserTest {

    @Mock
    private ArrayFlattenerService flattenerService;

    private ArrayReverser arrayReverser;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        arrayReverser = new ArrayReverser(flattenerService);
    }

    @Test
    public void testReverseArrayWithValidInput() {
        int[][] arr = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArr = {1, 3, 0, 4, 5, 9};
        int[] expected = {9, 5, 4, 0, 3, 1};

        when(flattenerService.flattenArray(arr)).thenReturn(flattenedArr);
        int[] result = arrayReverser.reverseArray(arr);

        assertArrayEquals(expected, result);
        verify(flattenerService, times(1)).flattenArray(arr);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[] result = arrayReverser.reverseArray(null);
        assertNull(result);
        verify(flattenerService, never()).flattenArray(any());
    }
}