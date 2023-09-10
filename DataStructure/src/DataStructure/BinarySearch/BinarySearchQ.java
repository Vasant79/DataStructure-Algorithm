package DataStructure.BinarySearch;

import java.util.Arrays;

public class BinarySearchQ {

    // first and last occurence
    public static void firstLastOccurence(int n[], int key) {

        int start = 0;
        int end = n.length - 1;
        int mid = (start + end) / 2;

        int firstOccurence;
        int lastOccurence;
        int totalOccurence;

        int ans = -1;

        // 1st
        while (start <= end) {

            if (n[mid] == key) {
                ans = mid;
                end = mid - 1;
            }

            if (key < n[mid]) {
                end = end - 1;
            }

            if (key > n[mid]) {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }

        firstOccurence = ans;

        System.out.println(firstOccurence);

        // last
        start = 0;
        end = n.length - 1;
        mid = (start + end) / 2;

        while (start <= end) {

            if (n[mid] == key) {
                ans = mid;
                start = mid + 1;
            }

            if (key < n[mid]) {
                end = end - 1;
            }

            if (key > n[mid]) {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }

        lastOccurence = ans;

        System.out.println(lastOccurence);
        System.out.println(totalOccurence = (lastOccurence - firstOccurence) + 1);

    }

    // find the peak index in mountain arr
    public static int peakIndex(int n[]) {

        // optimised searching using binary
        int start = 0;
        int end = n.length - 1;

        int mid = (start + end) / 2;

        while (start < end) {

            if (n[mid] > n[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

            // updating mid
            mid = (start + end) / 2;
        }

        return mid;
    }

    // find the pivot
    public static void pivotElement(int rotatedArr[]) {

        int start = 0;
        int end = rotatedArr.length - 1;
        int mid = (start + end) / 2;

        while (start < end) {

            if (rotatedArr[mid] >= rotatedArr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }

            // update mid
            mid = (end + start) / 2;
        }

        System.out.println("pivot index " + start + " ");
        System.out.println("pivot element " + rotatedArr[start]);
    }

    // search in rotated arr
    public static int searchForInt(int rotatedArr[], int key) {

        int start = 0;
        int end = rotatedArr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {

            if (rotatedArr[mid] == key) {
                return mid;
            }

            if (rotatedArr[mid] >= rotatedArr[0]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    // identifying square root
    public static int squareRoot(int key) {

        int start = 0;
        int end = key;
        int mid = (start + end) / 2;
        int ans = -1;

        while (start <= end) {

            if ((mid * mid) == key) {
                return mid;
            }

            if (key > (mid * mid)) {
                ans = mid;
                start = mid + 1; // mistake mid-1 -- did not give square root of perfect square
            }

            if (key < (mid * mid)) {
                end = mid - 1;
            }

            // updating mid
            mid = (start + end) / 2;

        }

        return ans;
    }

    // book allocation problem
    public static void allocateBook(int arr[], int student, int books) {

        // total sum
        int sum = 0;
        for (int i = 0; i < books; i++) {
            sum = sum + arr[i];
        }

        // search area
        int start = 0;
        int end = sum;
        int mid = (start + end) / 2;

        int ans = -1;

        while (start <= end) {

            if (isPossible(arr, student, books, mid)) {
                // storing possible ans
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            // updating mid
            mid = (start + end) / 2;
        }

        System.out.println(ans);

    }

    // isPossible for checking if pages smaller than mid
    public static boolean isPossible(int arr[], int student, int book, int mid) {

        int pages = 0;
        int studentCount = 1;

        for (int i = 0; i < book; i++) {
            if (pages + arr[i] <= mid) {
                pages = pages + arr[i];
            } else {
                studentCount++;
                if (studentCount > student) {
                    return false;
                }

                pages = arr[i];
            }
        }
        return true;
    }

    // aggressive cow
    public static int aggressiveCow(int arr[], int cow) {

        Arrays.sort(arr);

        // search area
        int start = 0;
        int end = Integer.MIN_VALUE;
        int mid = (start + end) / 2;

        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            end = Math.max(end, arr[i]);
        }

        System.out.println(start + " " + end);

        while (start <= end) {

            if (isPossible2(arr, cow, mid)) {
                ans = mid;
                start = mid + 1; // as we want max distance between cow -- max choose right
            } else {
                end = mid - 1;
            }

            // updating mid
            mid = (start + end) / 2;
        }

        return ans;
    }

    // aggressive cow ifPossible fn
    public static boolean isPossible2(int arr[], int cow, int mid) {

        // placing cow position
        int cowPosition = arr[0];
        int cowCount = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - cowPosition >= mid) {
                cowCount++;

                // mistake did > sign
                if (cowCount == cow) {
                    return true;
                }
                cowPosition = arr[i];
            }
        }
        return false;

    }

    // search for a key in rotated arr
    public static void searchInRotatedArr(int arr[], int key) {

    }

    // print array
    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        // firstLastOccurence(n, 6);
        // System.out.println(peakIndex(n));

        // System.out.println(peakIndex(n));
        // pivotElement(rotatedArr);

        // System.out.println(searchForInt(arr, 8));
        System.out.println(squareRoot(2147395599));

        // allocateBook(n, 2, 4);
        // System.out.println(aggressiveCow(arr, 2));
        // System.out.println(search(arr, 5));

    }

}
