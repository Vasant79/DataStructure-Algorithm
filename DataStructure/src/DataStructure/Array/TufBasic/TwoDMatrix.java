package TufBasic;

//task create fn that search for a target in matrix of sorted row and sorted col

public class TwoDMatrix {

    public static boolean search(int arr[][], int target) {
        int rowSize = arr.length;
        int colSize = arr[0].length;

        // no. of round
        for (int i = 0; i < rowSize; i++) {

            for (int j = 0; j < colSize; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }

        }
        return false;

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };

        System.out.println(search(arr, 20));

    }

}
