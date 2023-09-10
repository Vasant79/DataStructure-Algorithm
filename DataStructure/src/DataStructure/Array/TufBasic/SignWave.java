package TufBasic;

public class SignWave {

    public static void signWave(int arr[][]) {

        int rowLen = 3;
        int colLen = 4;

        for (int col = 0; col < colLen; col++) {

            // if odd print from certain way
            if ((col & 1) == 0) {

                // loop 2 printin from top to bottom
                for (int row = 0; row < rowLen; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                // loop 2 printing from bottom to top
                for (int row = rowLen - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }

        }

    }

    public static void main(String args[]) {

        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // ans 1 5 9 10 6 2 3 7 11 12 8 4
        signWave(arr);
    }

}
