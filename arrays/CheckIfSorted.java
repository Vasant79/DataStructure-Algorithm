package arrays;

public class CheckIfSorted {

    public static boolean checkSortingAscending(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    return false;
                }
            }

        }

        return true;

    }

    public static void main(String args[]) {

        int arr[] = { 5, 4, 6, 7, 8 };
        boolean result = checkSortingAscending(arr);

        System.out.println("Array sorted in ascending order : " + result);

    }

}
