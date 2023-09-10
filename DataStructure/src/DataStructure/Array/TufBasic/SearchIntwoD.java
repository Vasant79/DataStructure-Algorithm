package TufBasic;

// Input: matrix = 
// [[1,3,5,7],
//  [10,11,16,20],
//  [23,30,34,60]], 

// target = 3

// Output: true

public class SearchIntwoD {

    public static boolean SearchIntwoDMatrix(int arr[][], int target) {

        // loop for rows
        for (int row = 0; row < arr.length; row++) {

            // loop for col
            for (int col = 0; col < arr[0].length; col++) {

                // checking for target ele
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String args[]) {

        int arr[][] = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 } };

        System.out.println(SearchIntwoDMatrix(arr, 3));

    }

}
