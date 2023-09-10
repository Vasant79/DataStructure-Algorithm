package TufBasic;

public class RotateMatrix90 {

    public static void rotate90(int arr[][]) {

        int dummyArr[][] = new int[arr.length][arr[0].length];

        // itr original arr
        for (int col = 0; col < arr[0].length; col++) {

            for (int row = arr.length - 1; row >= 0; row--) {
                dummyArr[col][arr.length - 1 - row] = arr[row][col];

            }
        }

        print(dummyArr);

    }

    public static void print(int arr[][]) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
    }

    public static void main(String args[]) {

        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        rotate90(arr);

    }

}
