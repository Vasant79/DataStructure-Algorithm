package TufBasic;

public class CountReverse {

    public static int countReversePair(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > 2 * arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {

        int arr[] = { 3, 2, 1, 4 };

        int result = countReversePair(arr);
        System.out.println(result);
    }

}
