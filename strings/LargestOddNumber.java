package strings;

public class LargestOddNumber {

    // largest odd substring
    public static void largestOddSubstring(String str) {

        int largestOddNo = -1;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int val = 0;
                for (int k = i; k <= j; k++) {
                    char ch = str.charAt(k);
                    val = (val * 10) + Character.getNumericValue(ch);

                }
                if (val % 2 != 0) {
                    // odd no
                    largestOddNo = Math.max(largestOddNo, val);
                }
            }
        }

        if (largestOddNo == -1) {
            System.out.println(" ");
        } else {
            System.out.println(Integer.toString(largestOddNo));
        }

    }

    public static void main(String args[]) {

        String str = "35427";
        // largestOdd(str);
        largestOddSubstring(str);

    }

}
