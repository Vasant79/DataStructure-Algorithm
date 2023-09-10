package DataStructure.Sorting;

public class BubbleSort {

    public static void BubbleSorting(int arr[]) {

        for (int j = 0; j < arr.length; j++) {

            // we did -j coz at every round it fixes 1 greatest no
            for (int i = 0; i < arr.length - 1 - j; i++) {

                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
        print(arr);

    }

    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 2, 1, 5, 7, 3, 2, 1, 0 };
        BubbleSorting(arr);
    }

}
