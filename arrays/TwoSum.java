package arrays;

public class TwoSum {

    public static void findPair(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Yes Pair with sum equal to " + target + " is present");
                    System.out.println("index : " + i + " " + j);
                    return;
                }
            }
        }

        System.out.println("index : " + -1 + " " + -1);

    }

    public static void findPairOptimized(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (arr[start] + arr[end] == target) {
                System.out.println("Yes Pair with sum equal to " + target + " is present");
                System.out.println("index : " + start + " " + end);
                return;
            }
            start++;
            end--;
        }

        System.out.println("index : " + -1 + " " + -1);
    }

    public static void main(String args[]) {

        int arr[] = { 2, 6, 5, 8, 11 };
        int target = 14;

        findPairOptimized(arr, target);

    }

}
