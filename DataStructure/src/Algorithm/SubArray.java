package Algorithm;

public class SubArray {

    public static void printSubArray(int arr[]) {

        // start point
        for (int i = 0; i < arr.length; i++) {

            // size of subarray
            for (int j = i; j < arr.length; j++) {

                // print from start till size
                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k]);
                }
                System.out.println(" ");
            }

        }
    }

    public static void main(String args[]) {

        int arr[] = { 3, 1, 2, 4 };

        // print subarray
        printSubArray(arr);

    }

}
