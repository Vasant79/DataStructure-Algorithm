package TufBasic;

public class LongestSubArrayK {

    // problem -- my code only consider adjust cases not all possible sub array
    public static void subArraySumK(int arr[], int k, int n) {

        // storing possible answer
        int possibleAnswer[] = new int[n];
        int count = 0;
        int sum = 0;
        int index = 0;

        // itr arr
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            count++;

            if (sum == k) {
                // possible ans
                possibleAnswer[index] = count;
                index++;
            } else if (sum > k) {
                count = 0;
                sum = 0;
            }

        }

        max(possibleAnswer);

    }

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

        int arr[] = { -1, 1, 1 };
        int k = 1;
        int n = 3;

        subArraySumK(arr, k, n);
    }

}
