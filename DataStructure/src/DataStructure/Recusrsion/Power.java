package DataStructure.Recusrsion;

public class Power {

    // make recursive tree get clear understanding
    public static int power(int x, int power) {

        // base condition
        if (power == 0) {
            return 1;
        }

        // recursive releation
        return x * power(x, power - 1);

    }

    public static void main(String args[]) {

        int x = 2;
        int power = 3;

        System.out.println("2^" + power + " : ");

        System.out.println(power(x, power));
    }

}
