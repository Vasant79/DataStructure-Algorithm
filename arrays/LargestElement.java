package arrays;

/**
 * Problem statement - given arr of integer
 * expected - largest no in arr
 * 
 * Input: arr[] = {2,5,1,3,0};
 * Output: 5
 */

class LargestElement {

    public static int largest(int arr[]) {

        int ele = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ele) {
                ele = arr[i];
            }
        }

        return ele;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 1, 3, 0 };
        int result = largest(arr);

        System.out.println("Largest element is " + result);

    }
}