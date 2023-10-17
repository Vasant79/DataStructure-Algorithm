package TufBasic;

public class SubArrayMaxProduct {

    public static int maxSubArrayProduct(int arr[]) {
        int max = 0;
        int product = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                product = product * arr[j];

                if (product == 0) {
                    product = 1;
                    break;
                }

                max = Math.max(max, product);
            }
        }
        return max;
    }

    // optimized -- kadane algo max product of subarr -- not working properly
    public static int optimized(int arr[]) {

        int n = arr.length; // size of array.

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;
            if (suff == 0)
                suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }

    public static void main(String args[]) {

        // int arr[] = { 1, 2, -3, 0, -4, -5 };
        int arr[] = { -1, 3, 0, -4, 2 };

        // int maxProduct = maxSubArrayProduct(arr);
        int largestProduct = optimized(arr);

        System.out.println(largestProduct);
    }

}
