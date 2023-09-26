package RevistQuestions;

public class ArraySorted {

    public static boolean isSorted(int arr[], int i) {

        // base condition
        if (i == arr.length - 1) {
            return true;
        }

        // processing
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int i = 0;

        System.out.println(isSorted(arr, i));
    }

}
