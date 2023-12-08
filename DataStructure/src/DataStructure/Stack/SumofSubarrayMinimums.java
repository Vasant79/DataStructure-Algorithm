package DataStructure.Stack;

/**
 * mistakes -- subarray algo
 * declaring min at wrong place
 * -- giving error is some test cases
 * -- see how to do in stack
 */

public class SumofSubarrayMinimums {

    public static int sumofSubarrayMinimums(int arr[]) {

        int sum = 0;

        // start point
        for (int i = 0; i < arr.length; i++) {

            // size of subarray
            for (int j = i; j < arr.length; j++) {

                // print from start till size
                int min = Integer.MAX_VALUE;

                for (int k = i; k <= j; k++) {

                    if (min > arr[k]) {
                        min = arr[k];
                    }
                    // System.out.print(arr[k] + ","); -- printing subarray
                }
                sum = sum + min;
                // System.out.println("min" + min); --printin min value at evray subarray
            }

        }
        System.out.println("sum :" + sum);

        return sum % (10 ^ 9 + 7);

    }

    public static void main(String args[]) {

        int arr[] = { 11, 81, 94, 43, 3 };

        // print subarray
        int ans = sumofSubarrayMinimums(arr);

        System.out.println("Answer in 10^9 +7 :" + ans);

    }

}
