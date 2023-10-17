package TufBasic;

import java.util.*;

public class LargestSubArrayWithSumZero {

    // printing subArray
    public static void largestSubArrayWithSumZero(int arr[], int target) {

        int len = 0;

        for (int i = 0; i < arr.length; i++) {

            List<Integer> list = new ArrayList<>();

            list.add(arr[i]);

            if (arr[i] == target) {
                len = 1;
            }

            for (int j = i + 1; j < arr.length; j++) {

                list.add(arr[j]);
                int currentlen = list.size();

                if (sum(list) == target) {
                    len = max(currentlen, len);
                }

            }

        }
        System.out.println(len);

    }

    /*
     * Avoided max function
     * Avoide creation of extra variable currentlen
     * Increased readibility
     */
    public static void removingExtra(int arr[], int target) {

        int len = 0;

        for (int i = 0; i < arr.length; i++) {

            List<Integer> list = new ArrayList<>();

            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum(list) == target) {
                    len = Math.max(len, j - i + 1);
                }

            }

        }
        System.out.println(len);

    }

    /*
     * Optimized answer
     */

    public static int sum(List<Integer> list) {
        int sum = 0;

        for (int val : list) {
            sum = sum + val;
        }
        return sum;
    }

    public static int max(int currentlen, int len) {

        if (currentlen > len) {
            return currentlen;
        }
        return len;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 3, -5, 6, -2 };
        int target = 0;

        largestSubArrayWithSumZero(arr, target);

    }

}
