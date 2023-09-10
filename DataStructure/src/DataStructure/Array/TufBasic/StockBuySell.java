package TufBasic;

public class StockBuySell {

    public static void buySell(int arr[]) {

        int min = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }
            if (arr[i] - min > profit) {
                profit = arr[i];
                maxProfit = max(maxProfit, profit);
            }
        }

        System.out.println(maxProfit);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    public static void main(String args[]) {

        int arr[] = { 7, 1, 5, 3, 6, 4 };
        buySell(arr);
    }

}
