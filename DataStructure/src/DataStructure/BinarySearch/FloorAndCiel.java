package DataStructure.BinarySearch;

public class FloorAndCiel {

    // tc --> O(N)
    public static void floorCiel(int arr[], int n) {

        int floor = -1;
        int ciel = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= n) {
                floor = arr[i];
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= n) {
                ciel = arr[i];
                break;
            }
        }
        System.out.println("Floor value : " + floor);
        System.out.println("Ciel value : " + ciel);
    }

    // optimized -- approch find floor and ciel in seperate methods
    public static void optimized(int arr[], int n) {

        int floor = -1;
        int ciel = -1;

        int start = 0;
        int end = arr.length - 1;

        int mid = (start + end) / 2;

        while (start <= end) {

            if (arr[mid] == n) {
                floor = arr[mid];
                ciel = arr[mid];
                break;
            }

            if (arr[mid] > n) {
                // possible ciel
                ciel = arr[mid];
                end = mid - 1;
            } else if (arr[mid] < n) {
                floor = arr[mid];
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }

        System.out.println("Floor & Ciel : " + floor + " " + ciel);
    }

    public static void main(String args[]) {

        int arr[] = { 3, 4, 4, 7, 8, 10, 15, 19, 21 };
        int n = 18;
        // int n = 8;

        // floorCiel(arr, n);
        optimized(arr, n);
    }

}
