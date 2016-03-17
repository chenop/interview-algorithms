package string;

/**
 * Created by Chen on 13/03/2016.
 *
 * Print all permutation of a string
 */
public class StringPermutations {
    public static void main(String[] args) {
        String[] str = new String[]{"a", "b", "c", "d"};

        calcPermutations(str, "");
    }

    private static void calcPermutations(String[] str, String prefix) {
        if (prefix.length() == str.length) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length; i++) {
            String s = str[i];

            String newPrefix = prefix + s;
            calcPermutations(str, newPrefix);
        }
    }
}
