package DataStructure.Recusrsion;

public class SumOfArray {

    public static int sum(int arr[], int sum, int index) {

        // base case
        if (index == arr.length) {
            return sum;
        }

        // processing & call
        return sum(arr, sum = sum + arr[index], index + 1);
    }

    public static void main(String args[]) {

        int arr[] = { 3, 2, 5, 1, 6 };
        int sum = 0;
        int index = 0;

        System.out.println(sum(arr, sum, index));
    }
}
