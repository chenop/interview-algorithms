import java.util.Arrays;

/**
 * Created by Chen on 13/03/2016.
 *
 * Print all permutation of a string
 */
public class StringPermutations {
    public static void main(String[] args) {
        String[] str = new String[]{"a", "b", "c", "d"};

        calcPermutations(str);
    }

    private static void calcPermutations(String[] str) {
        if (str.length == 1) {
            System.out.println(str[0]);
            return;
        }

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
            swap(str, 0, i);
            String[] newStr = Arrays.copyOfRange(str, 1, str.length);
            // TODO need to pass the whole string...
            calcPermutations(newStr);
        }

    }

    private static void swap(String[] str, int index, int randomizeIndex) {
        String tmp = str[randomizeIndex];
        str[randomizeIndex] = str[index];
        str[index] = tmp;
    }

    private static int randomizeIndex(int n) {
        double random = Math.random();
        return (int) Math.floor (random * n);
    }

}
