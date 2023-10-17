package DataStructure.BinarySearch;

public class LastOccurence {

    // tc-- O(N)
    public static void lastOccurene(int arr[], int target) {

        int lastOccurene = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                lastOccurene = i;
            }
        }

        System.out.println(lastOccurene);
    }

    // optmized -- first occurence O(logn)
    public static void optimizedFirstOccurence(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        int firstOccurence = -1;

        int mid = (start + end) / 2;

        while (start <= end) {

            if (arr[mid] == target) {
                // possible first occ
                firstOccurence = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }

        System.out.println("First Occurence : " + firstOccurence);

    }

    // optimized -- last occurence
    public static void optimizedLastOccurence(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        int lastOccurence = -1;

        int mid = (start + end) / 2;

        while (start <= end) {

            if (arr[mid] == target) {
                lastOccurence = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }

        System.out.println("Last Occurence : " + lastOccurence);
    }

    public static void main(String args[]) {

        // given -- arr sorted
        int arr[] = { 3, 4, 13, 13, 13, 20, 40 };
        int target = 13;
        // int target = 60;
        // int target = 4;

        // lastOccurene(arr, target);
        optimizedFirstOccurence(arr, target);
        optimizedLastOccurence(arr, target);
    }
}