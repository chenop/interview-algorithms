package sort;

/**
 * Created by Chen on 12/03/2016.
 */
public class BubbleSort {
    public static void main(String[] argv) {
        Integer[] array = SortUtils.createMockArray();


        Integer[] res = doBubbleSort(array);
        for (int i = 0; i < res.length; i++) {
            Integer re = res[i];

            System.out.println(re);
        }
    }

    public static Integer[] doBubbleSort(Integer[] array) {
        boolean isSwapped;

        do {
            isSwapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                Integer a = array[i];
                Integer b = array[i+1];

                if (a > b) {
                    swap(array, i, i + 1);
                    isSwapped = true;
                }
            }
        }while (isSwapped);

        return array;
    }

    private static void swap(Integer[] array, int srcIndex, int tarIndex) {
        Integer tmp = array[srcIndex];
        array[srcIndex] = array[tarIndex];
        array[tarIndex] = tmp;
    }
}
