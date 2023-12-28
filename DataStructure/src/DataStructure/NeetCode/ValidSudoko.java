package DataStructure.NeetCode;

import java.util.*;

public class ValidSudoko {

    public static boolean isValidSudoku(char[][] arr) {

        // for look up -- hashset
        HashSet<Character> rowSet = null;
        HashSet<Character> colSet = null;

        // only able to validate for rows and col
        for (int i = 0; i < 9; i++) {

            rowSet = new HashSet<>();
            colSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                char r = arr[i][j];
                char c = arr[j][i];

                if (r != '.') {
                    if (rowSet.contains(r)) {
                        return false;
                    } else {
                        rowSet.add(r);
                    }

                }

                if (c != '.') {
                    if (colSet.contains(c)) {
                        return false;
                    } else {
                        colSet.add(c);
                    }
                }
            }
        }

        // check for 3X3 -- sub matrix also
        for (int i = 0; i < 9; i = i + 3) {

            for (int j = 0; j < 9; j = j + 3) {

                if (!checkBlock(i, j, arr)) {
                    return false;
                }
            }
        }

        return true;

    }

    // checking 3X3 blocks
    public static boolean checkBlock(int i, int j, char arr[][]) {

        HashSet<Character> set = new HashSet<>();

        int rowEnd = i + 3;
        int colEnd = j + 3;

        for (int l = i; i < rowEnd; i++) {

            for (int m = j; j < colEnd; m++) {

                if (arr[l][m] == '.') {
                    continue;
                }
                if (set.contains(arr[l][m])) {
                    return false;
                }
                set.add(arr[l][m]);

            }

        }

        return true;

    }

    public static void main(String args[]) {

        // 2d array 9X9 -- give borad here
        char board[][] = {};
        isValidSudoku(board);
    }

}
