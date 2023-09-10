package DataStructure.Recusrsion;

public class Factorial {

    // solution using recursion -- functional recursion
    public static int factorial(int n) {

        // base case
        if (n == 1) {
            return 1;
        }

        // releation
        return n * factorial(n - 1);

    }

    public static void main(String args[]) {

        int n = 6;
        System.out.println(factorial(n));
    }

}
