package DataStructure.Sorting;

public class InsertionSort {

    public static void InsertionSorting(int arr[]) {

        // no. of round
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            // comapring with sorted part and shifting
            int j = i - 1;
            while (j >= 0) {

                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];// movinf bigger ele to right
                }

                j--;
            }

            // coz after while loop j becomes j-2 that is -1;( did j+1 to get to actual
            // empty spot for smaller ele
            arr[j + 1] = temp;
        }

        print(arr);
    }

    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 22, 3, 4, 0, 2 };

        // best case sorted arr O(n) -- worst case reverse arr O(n) -- stable
        // algo(mantain order )
        InsertionSorting(arr);
    }

}
