
import java.util.*;

class Factorial {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        int n = ran.nextInt();
        int result = doFactorial(n);
        System.out.println(result);
    }

    public static int doFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * doFactorial(n - 1);
    }
}
