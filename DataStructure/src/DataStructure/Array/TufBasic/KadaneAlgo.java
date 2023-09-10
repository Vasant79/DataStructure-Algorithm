package TufBasic;

public class KadaneAlgo {

    public static void maxSumSubArray(int arr[]) {

        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }

        int totalSubArray = arr.length * (arr.length + 1) / 2;
        int sumArr[] = new int[totalSubArray];

        // System.out.println(sumArr.length);

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            sumArr[index] = arr[i];
            index++;

            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                // problem -- rectified
                sum = sum + arr[j];
                sumArr[index] = sum;
                index++;

            }
        }
        // print(sumArr);
        max(sumArr);
    }

    // printing arr
    public static void print(int arr[]) {

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    // find max from arr
    public static void max(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String args[]) {

        // int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int arr[] = { 1 };
        System.out.println("Maximum Sum of sub array is : ");
        maxSumSubArray(arr);

    }

}
