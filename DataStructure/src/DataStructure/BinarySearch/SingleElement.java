package DataStructure.BinarySearch;

public class SingleElement {

    // tc -- O(N)
    public static void singleElement(int arr[]) {

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i - 1] != arr[i] && arr[i] != arr[i + 1]) {
                System.out.println("Single Element : " + arr[i]);
                return;
            }
        }
    }

    // Optimized solution

    public static void main(String args[]) {

        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };

        singleElement(arr);
    }

}
