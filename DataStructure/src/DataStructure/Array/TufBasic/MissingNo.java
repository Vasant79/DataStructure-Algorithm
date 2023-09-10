package TufBasic;

public class MissingNo {

    public static void missingNo(int arr[], int n) {

        int actaulSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }

        System.out.println("Missing Number :" + (actaulSum - arrSum));
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 4, 5 };
        int n = 5;

        missingNo(arr, n);

    }

}
