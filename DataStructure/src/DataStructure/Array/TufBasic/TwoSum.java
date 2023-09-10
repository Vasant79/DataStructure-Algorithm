package TufBasic;

import java.util.Arrays;

public class TwoSum {

    public static String twoSum(int arr[], int target) {

        // variation 1- return yes if pairs meet target
        int start = 0;
        int end = arr.length - 1;

        Arrays.sort(arr);

        while (start < end) {

            if (arr[start] + arr[end] == target) {
                return "Yes";
            }

            if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }

        }

        return "No";

    }

    // variation 2- return index
    public static void twoSumIndex(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("indexs of pairs are : " + i + " " + j);
                    return;
                }

            }
        }

        System.out.println("indexs of pairs are : -1 -1");

    }

    public static void main(String args[]) {
        int target = 14;
        int arr[] = { 2, 6, 5, 8, 11 };

        System.out.println(twoSum(arr, target));
        twoSumIndex(arr, target);
    }

}
