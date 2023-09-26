package TufBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void longestConsecutiveSequence(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);
        int count = 1;

        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length) {
                if (arr[i] + 1 == arr[i + 1]) {
                    count++;

                } else {
                    list.add(count);
                    count = 0;
                }
            } else {
                // mistake -- was not able to figure out where to put this code
                list.add(count);
            }

        }

        // System.out.println(list);
        System.out.println(max(list));

    }

    public static int max(ArrayList<Integer> list) {

        int max = Integer.MIN_VALUE;

        for (int val : list) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static void main(String args[]) {

        int arr[] = { 100, 200, 1, 3, 2, 4 };

        longestConsecutiveSequence(arr);
    }

}
