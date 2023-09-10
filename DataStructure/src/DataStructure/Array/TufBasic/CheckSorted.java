
package TufBasic;

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: True.
// Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

public class CheckSorted {

    // can use -- i> i+1 or start itr from 1 and compare i-1 > i -- same thing
    public static boolean checkSorted(int arr[], int n) {

        for (int i = 1; i < n; i++) {

            if (i + 1 < n) {
                if (arr[i - 1] > arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {

        int N = 5;
        int arr[] = { 1, 2, 3, 4, 5 };
        int array[] = { 5, 4, 6, 7, 8 };

        System.out.println(checkSorted(arr, N));
        System.out.println(checkSorted(array, N));
    }

}
