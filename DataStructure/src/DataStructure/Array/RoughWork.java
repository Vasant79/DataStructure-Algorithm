
public class RoughWork {

    // correct note the answer is in string-- printing all subarray
    public static void subarr(int arr[]) {

        String str = "";

        for (int i = 0; i < arr.length; i++) {

            str = str + Integer.toString(arr[i]);
            System.out.println(str);

            for (int j = i + 1; j < arr.length; j++) {
                str = str + Integer.toString(arr[j]);
                System.out.println(str);

            }
            str = "";
        }

    }

    // printing len of longest subarray with sum k
    public static void sumOfSubArray(int arr[], int target) {

        int len = 0; // j-i+1 represents current length

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];

                }
                if (sum == target) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        System.out.println("using 3 loops : " + len);
    }

    // optimizing above code
    public static void optimize1(int arr[], int target) {

        int len = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum == target) {
                    count++;
                    len = Math.max(len, j - i + 1);
                }

            }
        }

        System.out.println("sub Arr with Max len : " + len);
        System.out.println("No of subArr having count " + target + " --> " + count);
    }

    public static void main(String args[]) {

        int arr[] = { 3, 1, 2, 4 };
        int k = 6;

        // subarr(arr);
        // sumOfSubArray(arr, k);
        optimize1(arr, k);

    }

}
