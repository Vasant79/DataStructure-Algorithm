package strings;

public class LongestPrefix {

    public static int longestPrefixCount(String arr[]) {

        int prefixCount = 0;
        boolean missMatch = false;

        for (int j = 0; j < arr[0].length(); j++) {
            for (int i = 1; i < arr.length; i++) {

                if (j >= arr[i].length() || arr[0].charAt(j) != arr[i].charAt(j)) {
                    missMatch = true;// * added
                    break;
                }
            }
            // * added
            if (missMatch) {
                break;
            }
            prefixCount++;

        }

        return prefixCount;
    }

    public static void longestPrefix(String arr[], int val) {
        if (val == 0) {
            System.out.println("");
        } else {

            for (int i = 0; i < val; i++) {
                System.out.print(arr[0].charAt(i));
            }
        }
    }

    public static void main(String args[]) {

        String arr[] = { "flower", "flow", "flight" };
        int val = longestPrefixCount(arr);
        longestPrefix(arr, val);
    }

}
