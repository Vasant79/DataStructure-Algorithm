package arrays;

public class BuyAndSellStock {

    public static void maxProfit(int arr[]) {

        int maxProfit = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int profit = arr[j] - arr[i];
                maxProfit = Math.max(profit, maxProfit);

            }

        }

        System.out.println("Maximum profit is : " + maxProfit);
    }

    // optimized solution
    public static void maxProfitOptimized(int arr[]) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        // find min and max on the go
        for (int i = 0; i < arr.length; i++) {

            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        System.out.println("Maximum profit is (optimized) : " + maxProfit);
    }

    public static void main(String args[]) {

        int arr[] = { 7, 1, 5, 3, 6, 4 };
        maxProfit(arr);
        maxProfitOptimized(arr);

    }

}
