package DataStructure.BinarySearch;

public class SmallestInRotated {

    public static void smallest(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        int mid = (start + end) / 2;

        while (start <= end) {

            // this condition imp -- checks smallest for sorted range
            if (arr[start] < arr[end]) {
                System.out.println("Smallest ele : " + arr[start]);
                return;
            }

            // conditon when mid is the smallest
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                int pivot = arr[mid];
                System.out.println("Smallest : " + pivot);
                return;
            }

            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;

        }
    }

    public static void main(String args[]) {

        int arr[] = { 3, 4, 5, 1, 2 };

        // pivot will be the smallest
        smallest(arr);

    }

}
