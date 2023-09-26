package TufBasic;

public class MatrixZero {

    // this only works if zero appears once -- for multiple zero use array
    public static void matrixZero(int arr[][]) {

        int zeroRow[] = new int[arr.length];
        int zeroCol[] = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 0) {
                    zeroRow[i] = 1;
                    zeroCol[j] = 1;
                }
            }
        }

        // itr and making 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (zeroCol[j] == 1 || zeroRow[i] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

        print(arr);

    }

    // print 2d array
    public static void print(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String args[]) {

        // note my approch was correct in first time -- for handeling multiple zer use
        // arr

        int arr[][] = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };

        matrixZero(arr);
    }

}
