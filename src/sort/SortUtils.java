package sort;

/**
 * Created by Chen on 12/03/2016.
 */
public class SortUtils {
    public static Integer[] createMockArray() {
        return new Integer[]{5, 4, 3, 6, 7, 8, 2, 1, 9};
    }

    public static void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Integer integer = arr[i];

            System.out.println(integer);
        }
    }
}
