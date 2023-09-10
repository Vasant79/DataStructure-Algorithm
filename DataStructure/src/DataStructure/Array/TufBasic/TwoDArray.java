package TufBasic;

public class TwoDArray {

    // sum of each row
    public static void rowSum(int arr[][]) {

        int colLength = 3;
        int max = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < colLength; col++) {
                sum = sum + arr[row][col];
            }
            System.out.println(" sum : " + sum);

            // getting maximum sum
            if (max < sum) {
                max = sum;
                maxRow = row;
            }
        }
        System.out.println("Maximum sum --> " + max);
        System.out.println("Row with max sum --> " + maxRow);

    }

    public static void main(String args[]) {

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rowSum(arr);
    }

}
