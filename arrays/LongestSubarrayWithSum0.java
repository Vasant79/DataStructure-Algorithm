package arrays;

public class LongestSubarrayWithSum0 {

    public static void longestSubarray(int arr[]) {
        int target = 0;
        int longestLen = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {

                    sum = sum + arr[k];

                }
                if (sum == target) {
                    int len = j - i + 1;
                    longestLen = Math.max(longestLen, len);
                }
            }
        }

        System.out.println("Length of longest sub array with sum target : " + longestLen);
    }

    public static void main(String args[]) {
        int arr[] = { 9, -3, 3, -1, 6, -5 };

        longestSubarray(arr);
    }

}
