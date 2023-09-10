package TufBasic;

import java.util.Arrays;

// Example 1:

// Input: [1,2,4,7,7,5]
// Output: Second Smallest : 2
// 	Second Largest : 5
// Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

public class SecondLargestSmallest {

    // brute forced only works if not duplicate
    public static void secondLargestSmallest(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Second Minimum & Second Maximum : " + arr[1] + " " + arr[arr.length - 2]);

    }

    // approch 2 -- better
    public static void betterApproch(int arr[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // find max and min
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        // finding second minimum and second max
        for (int i = 0; i < arr.length; i++) {

            if (secondMin > arr[i] && arr[i] != min) {
                secondMin = arr[i];
            }

            if (secondMax < arr[i] && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Minimum and maximum are  : " + min + " " + max);
        System.out.println("Second Minimum and Second Maximum are  : " + secondMin + " " + secondMax);

    }

    // optimal approch
    public static void optimialApprochSecondSmallest(int arr[]) {

        // comparing on the go finding smallest and assigning smallest to 2nd smallest
        // if case arr[i]<small

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }

        System.out.println("Smallest : " + small + " ,Second smallest : " + secondSmall);
    }

    // do same for largest on the go comparison
    public static void optimalApprochSecondLargest(int arr[]) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // loop to itr the whole arr
        for (int i = 0; i < arr.length; i++) {

            // finding max
            if (arr[i] > max) {
                // assigning last max value to secong max
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i] && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Max : " + max + " ,Second Max : " + secondMax);
    }

    // ------------------ program above ----------------------------
    public static void main(String args[]) {

        int arr[] = { 10, 1, 8, 2, 4, 7, 7, 5 };
        // int array[] = { -1 };

        optimialApprochSecondSmallest(arr);
        optimalApprochSecondLargest(arr);

    }

}
