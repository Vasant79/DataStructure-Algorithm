package arrays;

/**
 * 2 approches came to mind both were correct slight problem in where to put sum
 */

public class CountSubarrayWithSumk {

    public static void countOfSubarrayWithSumk(int arr[], int target) {

        int subArrCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0; // Reset sum for each i
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    subArrCount++;
                }
            }
        }

        System.out.println("Count of subarray with sum " + target + " is : " + subArrCount);
    }

    public static void countOfSubarrayWithSumk2(int arr[], int target) {

        int subArrCount = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {

                    sum = sum + arr[k];

                }
                if (sum == target) {
                    subArrCount++;
                }
            }
        }

        System.out.println("Count of sub array with sum " + target + " is : " + subArrCount);
    }

    public static void main(String args[]) {

        int arr[] = { 3, 1, 2, 4 };
        countOfSubarrayWithSumk2(arr, 6);

    }

}
