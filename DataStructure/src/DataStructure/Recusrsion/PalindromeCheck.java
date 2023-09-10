package DataStructure.Recusrsion;

public class PalindromeCheck {

    public static boolean palindrome(String str, int firstindex, int LastIndex) {

        // base
        if (firstindex >= str.length() / 2) {
            return true;
        }

        // processing
        if (str.charAt(firstindex) != str.charAt(LastIndex)) {
            // System.out.println("Not Palindrome");
            return false;
        }

        // call
        palindrome(str, firstindex + 1, LastIndex - 1);

        return true;
    }

    public static void main(String args[]) {

        String str = "RACECAR";
        int firstindex = 0;
        int LastIndex = str.length() - 1;

        if (palindrome(str, firstindex, LastIndex)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
