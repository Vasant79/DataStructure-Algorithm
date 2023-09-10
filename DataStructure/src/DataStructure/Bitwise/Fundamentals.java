package DataStructure.Bitwise;

public class Fundamentals {

    // fn to check if even or odd
    public static String evenOdd(int n) {

        if ((n & 1) != 0) {
            return "odd";
        } else {
            return "even";
        }
    }

    // fn to check if 2 no have opp sign -- Note : whenever opp or similar think for
    // xor
    public static String oppSign(int n, int m) {
        if ((n ^ m) < 0) {
            return "Opposite sign";
        } else {
            return "Same sign";
        }
    }

    // add 1 to no
    public static int Add1(int n) {

        return -~n;
    }

    // swap 2 no using bitwise operator
    public static void swap(int n, int m) {
        System.out.println("Before : n -> " + n + "," + " m ->" + m);

        n = n ^ m;
        m = n ^ m;
        n = m ^ n;

        System.out.println("After : n -> " + n + "," + " m ->" + m);
    }

    // turn off i th bit in a number (binary)
    public static void turnOff(int n, int i) {

        // we need to move to i locatin - <<i
        // we need to & with 1 (rever one so that at only ith position it is zero)

        n = n & ~(1 << i - 1); // understand ~
        System.out.println(n);
    }

    // turn on ith bit
    public static void turnOn(int n, int i) {

        n = n | (1 << i - 1);
        System.out.println(n);
    }

    // check if ith bit is set
    public static void checkSetBit(int n, int i) {

        if ((n & (1 << i - 1)) != 0) { // had prob
            System.out.println("Yes bit is set ");
        } else {
            System.out.println("Bit is not set");
        }
    }

    // calculating square of number
    public static void square(int n) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result + n;
        }

        System.out.println(result);
    }

    // Copy set bits in a range
    public static void copyBits(int x, int y, int l, int r) {

        // check if at l & r bit is set in y
        int bitForL = 0;
        int bitForR = 0;

        if ((y & (1 << l - 1)) != 0) {
            bitForL = 1;
        }

        if (((y & (1 << r - 1)) != 0)) {
            bitForR = 1;
        }

        // making set bit at l & r - 1 in x
        if (bitForL != 0) {
            x = x | (1 << l - 1); // here made a mistake used & instead of or
        }
        if (bitForR != 0) {
            x = x | (1 << r - 1);
        }

        System.out.println(x);
    }

    // dividing a no. without +,-,%,/
    public static void divide(int dividend, int divisor) {

        // optimized logic
        double result = Math.exp((Math.log(dividend) - Math.log(divisor)));

        // converting result (double) to int to round off incase getting decimal value
        int finalResult = (int) result;
        System.out.println(finalResult);
    }

    // understanding ~
    public static void notOperator(int n) {

        // compiler all ways return 2's compliment however actual it is reverse of n in
        // binary 1->0,0->1
        int a = ~n;
        System.out.println(a);

    }

    public static void main(String args[]) {

        // System.out.println(evenOdd(6));
        // System.out.println(oppSign(6, -5));
        // System.out.println(Add1(1));

        // swap(2, 3);
        // turnOff(5, 3);

        // notOperator(4);

        // turnOn(2, 1);
        // checkSetBit(4, 3);
        // square(5);

        // copyBits(8, 7, 1, 2);
        divide(10, 3);

    }
}
