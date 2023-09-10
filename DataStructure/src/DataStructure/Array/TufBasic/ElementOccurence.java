package TufBasic;

// Example 1:

// Input Format: arr[] = {2,2,1}
// Result: 1
// Explanation: In this array, only the element 1 appear once and so it is the answer.

public class ElementOccurence {

    public static void elementOccuringOnce(int arr[]) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            result = result ^ arr[i];
        }

        System.out.println(result);
    }

    public static void main(String args[]) {

        int arr[] = { 4, 1, 2, 1, 2 };

        elementOccuringOnce(arr);
    }

}
