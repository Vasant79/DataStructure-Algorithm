package TufBasic;

// Question Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 5
// Explanation: 5 is the largest element in the array.

public class LargestElement {

    public static void largest(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int number : arr) {

            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);
    }

    public static void main(String args[]) {

        int arr[] = { 2, 5, 1, 3, 0 };
        int arr2[] = { 8, 10, 5, 7, 9 };

        largest(arr);
        largest(arr2);
    }

}
