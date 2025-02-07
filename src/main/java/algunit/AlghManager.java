package algunit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlghManager {
    public static int[] moveElementsOnKLeft(int k, int[] arr) {
        var arr2 = new int[arr.length];
        var length = arr.length;
        for (int i = 0; i <= length - 1; i++) {
            arr2[getElementPosition(i, k, arr.length)] = arr[i];
        }
        return arr2;
    }

    private static int getElementPosition(int position, int k, int length) {
        if (position + k < length) {
            return position + k;
        } else {
            return position + k - length;
        }
    }

    public static int kadaneArr(int[] arr) {
        // 1 , 2, -4 ,6 ,2 , -10, 11, -8
        var currentMax= arr[0];
        var globalMax = arr[0];

        return 0;
    }

    public static List<Integer> removerDuplicated(List<Integer> listWithDuplicates) {
        HashMap<Integer, Integer> duplicatesCount = new HashMap<>();
        listWithDuplicates
                .forEach(value -> duplicatesCount.put(value, duplicatesCount.getOrDefault(value, 0) + 1));
        return duplicatesCount
                .entrySet()
                .stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
    }
}
