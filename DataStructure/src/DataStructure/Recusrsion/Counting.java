package DataStructure.Recusrsion;

public class Counting {

    public static void count(int n) {

        // base case
        if (n == 0) {
            return;
        }

        // will print no. in reverse --processing
        System.out.println(n--);

        // recursive releation
        count(n);
    }

    public static void main(String args[]) {
        int n = 10;
        count(n);
    }

}
