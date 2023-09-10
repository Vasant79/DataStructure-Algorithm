package TufBasic;

public class SpiralTwoDPrint {

    public static void printInSpiral(int arr[][]) {

        int startingRow = 0;
        int startingCol = 0;

        int lastRow = arr.length - 1;
        int lastCol = arr[0].length - 1;

        int count = 0;
        int total = arr.length * arr[0].length; // no. rows * col

        while (count < total) {

            // && count < total -- coz once enetred in loop check for every inner loop if to
            // run or not
            for (int i = startingCol; i <= lastCol && count < total; i++) {
                System.out.print(arr[startingRow][i] + " ");
                count++;
            }
            startingRow++;

            for (int i = startingRow; i <= lastRow && count < total; i++) {
                System.out.print(arr[i][lastCol] + " ");
                count++;
            }
            lastCol--;

            for (int i = lastCol; i >= startingCol && count < total; i--) {
                System.out.print(arr[lastRow][i] + " ");
                count++;
            }
            lastRow--;

            for (int i = lastRow; i >= startingRow && count < total; i--) {
                System.out.print(arr[i][startingCol] + " ");
                count++;
            }
            startingCol++;
        }

    }

    public static void main(String args[]) {

        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int array[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };

        printInSpiral(arr);
        System.out.println(" ");
        printInSpiral(array);
    }

}
