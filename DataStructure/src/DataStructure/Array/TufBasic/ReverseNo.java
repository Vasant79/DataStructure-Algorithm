package TufBasic;

public class ReverseNo {
    public static int reverse(int x) {

        // check if no < 2^31 &&
        if (x < Math.pow(-2, 31) || x >= Math.pow(2, 31)) {
            return 0;
        }

        // check for sign
        int number = 0;

        // reverse a no.
        while (x != 0) {

            int digit = x % 10;
            number = number * 10 + digit;
            x = x / 10;
        }

        return number;

    }

    public static void main(String args[]) {

        int no = -123;

        System.out.print(reverse(no));
    }

}
