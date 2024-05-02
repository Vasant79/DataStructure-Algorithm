package arrays;

public class SubarrayWithLargestSum {

    public static void getSubarrayWithLargestSum(int arr[]) {

        int maxSubArraySum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int subArraySum = 0;
                for (int k = i; k <= j; k++) {
                    subArraySum = subArraySum + arr[k];
                }

                maxSubArraySum = Math.max(subArraySum, maxSubArraySum);
            }
        }

        System.out.println("Maximum sum of a sub array is : " + maxSubArraySum);
    }

    public static void main(String args[]) {

        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        getSubarrayWithLargestSum(arr);

    }

}
