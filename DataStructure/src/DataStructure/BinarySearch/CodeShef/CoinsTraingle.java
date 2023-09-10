package DataStructure.BinarySearch.CodeShef;

import java.util.Scanner;

public class CoinsTraingle {

    // function 2
    public static int getCoins(int height) {

        int coins = 0;

        // formula for getting sum of n natural no;
        coins = height * (height + 1) / 2;
        return coins;
    }

    // function 1
    public static int heightOfTraingle(int coins) {

        // Edge case: Triangle cannot be formed with 0 or 1 coin
        if (coins <= 1) {
            return 0;
        }

        int start = 0;
        int end = coins;

        int mid = start + (end - start) / 2;

        int ans = -1;

        while (start < end) {

            // getCoins fn that takes height param
            if (getCoins(mid) == coins) {
                return mid;
            }

            if (getCoins(mid) < coins) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid;
            }

            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter no of coins > 1:");
        int coins = sc.nextInt();

        // giving output
        System.out.print("Max possible height of traingle is ");
        System.out.println(heightOfTraingle(coins));
        sc.close();

    }
}
