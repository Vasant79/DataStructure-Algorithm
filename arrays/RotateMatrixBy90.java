package arrays;

import java.util.Arrays;

public class RotateMatrixBy90 {

    public static void rotate(int arr[][]) {

        int resultArr[][] = new int[arr.length][arr[0].length];
        int last = arr[0].length - 1;

        System.out.println(last);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j]);
                resultArr[j][last] = arr[i][j];

            }
            last--;
            System.out.println();
        }

        System.out.println("Matrix rotated by 90 : " + Arrays.deepToString(resultArr));

    }

    public static void main(String args[]) {

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        rotate(arr);
    }
}
