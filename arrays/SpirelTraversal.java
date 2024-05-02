package arrays;

public class SpirelTraversal {

    public static void traverse(int arr[][]) {

        int start = 0;
        int end = arr[0].length - 1;

        int top = 0;
        int right = arr[0].length - 1;
        int bottom = arr[0].length - 1;
        int left = 0;

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        traverse(arr);
    }

}
