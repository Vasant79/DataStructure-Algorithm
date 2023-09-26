package DataStructure.Recusrsion;

public class PowerOfNo {

    public static int power(int a, int b) {

        // base
        if (b == 0) {
            return 1;
        }

        // processing and call
        return a * power(a, b - 1);
    }

    public static void main(String args[]) {

        int a = 2;
        int b = 4;

        int result = power(a, b);
        System.out.println("Power of " + a + "^" + b + " is " + result);
    }

}
