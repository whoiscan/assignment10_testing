package miu.edu.task1;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public static int[] flattenArray(int[][] arr) {
        if (arr == null) return null;
        List<Integer> list = new ArrayList<>();
        for (int[] row : arr) {
            for (int num : row) {
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }
}
