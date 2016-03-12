package recursion;

/**
 * Created by Chen on 09/03/2016.
 */
public class Fibonachi {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("n == " + n + ": " + doFib(n));;
    }

    public static int doFib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        return doFib(n-1) + doFib(n-2);
    }
}
