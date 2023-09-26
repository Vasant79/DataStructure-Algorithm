package DataStructure.Recusrsion;

public class LinearSearch {

    public static boolean search(int arr[], int key, int index) {

        // base
        if (index == arr.length) {
            return false;
        }

        // processing and call
        if (arr[index] == key) {
            return true;
        }

        // call
        return search(arr, key, index + 1);
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int key = 3;
        int index = 0;

        System.out.println(search(arr, key, index));
    }

}
