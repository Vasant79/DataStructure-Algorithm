package TufBasic;

public class RemoveDuplicate {

    // keep track of last element and comapre it new if diffrent update index
    public static void removeDuplicate(int arr[]) {
        int element = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            int newElement = arr[i];
            if (element != newElement) {
                element = newElement;
                arr[index] = element;
                index++;
            }
        }
        print(arr);
    }

    public static void print(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };

        removeDuplicate(arr);
    }
}
