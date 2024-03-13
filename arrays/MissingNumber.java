package arrays;

public class MissingNumber {

    public static int sumOfN(int n) {

        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    public static void missingNumber(int arr[], int n) {

        int result = 0;
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }

        result = sumOfN(n) - arrSum;
        System.out.println("Missing number is : " + result);

    }

    public static void main(String args[]) {

        int n = 5;
        int arr[] = { 1, 2, 4, 5 };

        missingNumber(arr, n);

    }

}
