package arrays;

public class LinearSearchElement {

    public static void linearSearch(int arr[], int element) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element) {
                System.out.println("index of element is : " + i);
                return;
            }
        }
        System.out.println("index of element is : " + -1);

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int element = 3;

        linearSearch(arr, element);

    }

}
