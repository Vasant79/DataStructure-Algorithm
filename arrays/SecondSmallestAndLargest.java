package arrays;

public class SecondSmallestAndLargest {

    public static void sort(int arr[]) {

        // bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int nLargest(int arr[], int position) {
        sort(arr);
        return arr[arr.length - position];
    }

    public static int nSmallest(int arr[], int position) {
        sort(arr);
        return arr[position - 1];
    }

    public static void main(String args[]) {

        int arr[] = { 1, 6, 4, 7, 7, 5 };
        int position = 2;

        int nLargest = nLargest(arr, position);
        int nSmallest = nSmallest(arr, position);

        System.out.println(position + " largest : " + nLargest);
        System.out.println(position + " smallest : " + nSmallest);
    }

}
