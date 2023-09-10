package DataStructure.Recusrsion;

public class ReverseCounting {

    public static void reverseCount(int n) {

        // base case
        if (n < 1) {
            return;
        }

        // processing
        System.out.println(n);
        n--;

        // recursive releation
        reverseCount(n);

    }

    public static void main(String args[]) {

        int n = 10;
        reverseCount(n);
    }

}
