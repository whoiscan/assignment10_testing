package miu.edu.task2;

import java.util.Arrays;

public class ArrayFlattenerServiceImpl implements ArrayFlattenerService {
    @Override
    public int[] flattenArray(int[][] arr) {
        return Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
    }
}