package DataStructure.BinarySearch;

public class CountOccurence {

    // tc-- O(N)
    public static void Occurence(int arr[], int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Occurence " + count);
    }

    // optimized solution -- O(logn)
    public static void frequency(int arr[], int target) {

        // find first occurence & last ocuurence -- lastOcc - firstOcc
    }

    public static void main(String args[]) {

        int arr[] = { 2, 2, 3, 3, 3, 3, 4 };
        int target = 3;

        Occurence(arr, target);
        frequency(arr, target);
    }

}
