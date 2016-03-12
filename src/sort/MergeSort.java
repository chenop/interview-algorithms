package sort;

import java.util.Arrays;

/**
 * Created by Chen on 10/03/2016.
 */
public class MergeSort {
    public static void main(String[] argv) {
        Integer[] array = SortUtils.createMockArray();

        System.out.println(mergeSort(array));
    }

    private static Integer[] mergeSort(Integer[] array) {
        int length = array.length;
        if (length <= 1)
            return array;

        Integer[] leftArray = mergeSort(Arrays.copyOfRange(array, 0, length / 2 - 1  ));
        Integer[] rightArray = mergeSort(Arrays.copyOfRange(array, length / 2 , length ));

        return merge(leftArray, rightArray);
    }

    private static Integer[] merge(Integer[] leftArray, Integer[] rightArray) {
        Integer[] merged = new Integer[leftArray.length + rightArray.length];

        int l = 0, r = 0, j = 0;

        while ( l < leftArray.length || r < rightArray.length) {
            if (leftArray[l] < rightArray[r]) {
                merged[j] = leftArray[l];
                l++;
            }
            else {
                merged[j] = rightArray[r];
                r++;
            }
            j++;
        }

        return merged;
    }
}
