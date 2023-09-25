package miu.edu.task2;

public class ArrayReverser {
    private final ArrayFlattenerService flattenerService;

    public ArrayReverser(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] input) {
        if (input == null) {
            return null;
        }

        int[] flattenedArr = flattenerService.flattenArray(input);
        int[] result = new int[flattenedArr.length];

        for (int i = 0; i < flattenedArr.length; i++) {
            result[i] = flattenedArr[flattenedArr.length - 1 - i];
        }

        return result;
    }
}
