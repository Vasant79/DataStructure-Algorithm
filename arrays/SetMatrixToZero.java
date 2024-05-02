package arrays;

import java.util.*;

/**
 * assuming there is only one 0 peresnt
 * if multiple 0 present store values of zero in set & when making row & col
 * zero check for contains
 */

public class SetMatrixToZero {

    public static void setToZero(int arr[][]) {

        Set<Integer> rowToBeZero = new HashSet<>();
        Set<Integer> colToBeZero = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

                if (arr[i][j] == 0) {
                    // set ith row & col to zero
                    rowToBeZero.add(i);
                    colToBeZero.add(j);

                }
            }

            System.out.println();
        }

        System.out.println("row & col to be zero : " + rowToBeZero + " " + colToBeZero);
        setToZero(arr, rowToBeZero, colToBeZero);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void setToZero(int arr[][], Set<Integer> rowToBeZero, Set<Integer> colToBeZero) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (rowToBeZero.contains(i)) {
                    arr[i][j] = 0;
                }
                if (colToBeZero.contains(j)) {
                    arr[i][j] = 0;
                }
            }

        }

    }

    public static void main(String args[]) {
        int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        setToZero(arr);

    }

}
