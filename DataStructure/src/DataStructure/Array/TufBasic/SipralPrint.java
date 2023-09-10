package TufBasic;

public class SipralPrint {

    public static void spiral(int[][] matrix) {

        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int count = 0;
        int total = rowSize * colSize;

        // indexs
        int firstRow = 0;
        int lastCol = colSize - 1;

        int lastRow = rowSize - 1;
        int firstCol = 0;

        // a bit confused in first row last col condition -- condition to avoid
        // duplicate

        while (count < total) {
            // printing first row
            for (int i = firstCol; i <= lastCol && count < total; i++) {
                System.out.print(matrix[firstCol][i] + " ");
                count++;

            }
            firstRow++;

            // printing last col
            for (int i = firstRow; i <= lastRow && count < total; i++) {
                System.out.print(matrix[i][lastCol] + " ");
                count++;

            }
            lastCol--;

            // printing last row
            for (int i = lastCol; i >= firstCol && count < total; i--) {
                System.out.print(matrix[lastRow][i] + " ");
                count++;
            }
            lastRow--;

            // printing 1st col
            for (int i = lastRow; i >= firstRow && count < total; i--) {
                System.out.print(matrix[i][firstCol] + " ");
                count++;
            }
            firstCol++;

        }

    }

    public static void main(String args[]) {

        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // ans [1,2,3,6,9,8,7,4,5]
        // ans 1,2,3,4,8,12,11,10,9,5,6,7

        spiral(arr);
    }

}
