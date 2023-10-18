package Algorithm;

public class Kadane {

    // to find max sum of a sub array
    public int maxSubArray(int[] arr) {

        if (arr.length == 1) {
            return arr[0];
        }

        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        // using kadane algo

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;

    }

}
