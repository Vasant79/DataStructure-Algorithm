package TufBasic;

import java.util.Arrays;

public class TwoSumNew {

    // variation -- yes if contains target -- return indices
    public static String checkSum(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                // condition
                if (arr[i] + arr[j] == target) {
                    // return new arr[i,j];
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static String checkSumVariation(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                // condition
                if (arr[i] + arr[j] == target) {
                    return Arrays.toString(new int[] { i, j });
                }
            }
        }

        return Arrays.toString(new int[] { -1, -1 });
    }

    // optimized for only 1 variation
    public static String pairExist(int arr[], int target) {

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (arr[start] + arr[end] == target) {
                return "Yes";
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else if (arr[start] + arr[end] < target) {
                start++;
            }
        }

        return "No";
    }

    public static void main(String args[]) {

        int arr[] = { 2, 6, 5, 8, 11 };
        int target = 14;

        // String result = checkSum(arr, target);
        // System.out.println(result);

        // String output = checkSumVariation(arr, target);
        // System.out.println(output);

        String ans = pairExist(arr, target);
        System.out.print("Pair exist : " + ans);

    }

}
