package DataStructure.Recusrsion;

// Q --> print n to 1 using back tracking

public class BackTracking {

    public static void backTrack(int n, int k) {

        // base condition
        if (k > n) {
            return;
        }

        backTrack(n, k + 1);
        System.out.print(k + " ");
    }

    public static void main(String args[]) {

        int n = 5;
        int k = 1;

        backTrack(n, k);

    }

}
