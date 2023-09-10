package TufBasic;

// Example 1:

// Input: arr[]= 1 2 3 4 5, num = 3
// Output: 2
// Explanation: 3 is present in the 2nd index

public class LinearSearch {

    public static int linearSearch(int arr[], int num) {

        // looping and comparing each ele if true return index
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int num = 8;

        System.out.println(linearSearch(arr, num));
    }

}
