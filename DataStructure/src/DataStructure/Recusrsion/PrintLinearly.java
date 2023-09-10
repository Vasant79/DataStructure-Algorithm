package DataStructure.Recusrsion;

public class PrintLinearly {

    public static void printLinearly(int firstDigit, int n) {

        // base condition
        if (firstDigit > n) {
            return;
        }

        // processing
        System.out.print(firstDigit + " ");
        firstDigit++;

        // recursive releation
        printLinearly(firstDigit, n);
    }

    public static void main(String args[]) {

        int n = 20;
        int firstDigit = 1;

        printLinearly(firstDigit, n);
    }

}
