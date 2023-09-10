package TufBasic;

public class TransposeMatrix {

    // in place transpose
    public static void matrixTranspose(int arr[][]) {

        for (int row = 0; row < arr.length - 1; row++) {
            for (int col = row + 1; col < arr[0].length; col++) {

                // swap
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }

        print(arr);

    }

    // brute force
    public static void bruteForce(int arr[][]) {

        int n = arr.length;

        // create new arr
        int matrix[][] = new int[n][n];

        // itr martix -- and put the elem in correct place
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // put ele of original in new at right location
                matrix[i][j] = arr[j][i];

            }
        }

        print(matrix);
    }

    // ------------------------------------------------
    public static void print(int arr[][]) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {

        int arr[][] = { { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 } };

        bruteForce(arr);

        System.out.println();

        matrixTranspose(arr);

    }

}
