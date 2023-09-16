package DataStructure.Recusrsion;

public class SumOfNNaturalNo {

    // parameterized
    public static void printSum(int k, int n, int sum) {

        // base
        if (k > n) {
            System.out.println(sum);
            return;
        }

        // processing
        // sum = sum + k; -- directly added in recursive call

        printSum(k + 1, n, sum + k);

    }

    // functional -- we give releation
    public static int printSum_2(int n) {

        if (n == 0) {
            return 0;
        }

        return n + printSum_2(n - 1);
    }

    public static void main(String args[]) {

        // int k = 1;
        int n = 10;
        // int sum = 0;

        // printSum(k, n, sum);
        System.out.println(printSum_2(n));

    }

}
