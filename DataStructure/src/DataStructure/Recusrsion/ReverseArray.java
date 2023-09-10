package DataStructure.Recusrsion;

public class ReverseArray {

    public static void reverse(int arr[], int starting, int ending) {

        // base
        if (starting == ending) {
            return;
        }

        // processing --> swap
        int temp = arr[starting];
        arr[starting] = arr[ending];
        arr[ending] = temp;

        // recursive call
        reverse(arr, starting + 1, ending - 1);

    }

    public static void print(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };

        reverse(arr, 0, arr.length - 1);
        print(arr);
    }

}
