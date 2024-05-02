import java.util.*;

public class test {

    public static void merge(int arr[], int start, int mid, int end) {

        List<Integer> list = new ArrayList<>();
        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {

            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= end) {
            list.add(arr[right]);
            right++;
        }

        // mistake here -- understand arrList.get(i-start)
        for (int i = start; i <= end; i++) {
            arr[i] = list.get(i - start);
        }

    }

    public static void mergeSort(int arr[], int start, int end) {

        // base
        if (start >= end) {
            return;
        }

        // processing & fn call
        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        System.out.println(Arrays.toString(arr));
        merge(arr, start, mid, end);

    }

    public static void main(String args[]) {

        int arr[] = { 4, 2, 7, 1, 0, 9, 5 };
        int start = 0;
        int end = arr.length - 1; // * mistake here

        mergeSort(arr, start, end);
        System.out.println("Sorted using merge sort : " + Arrays.toString(arr));

    }

}
