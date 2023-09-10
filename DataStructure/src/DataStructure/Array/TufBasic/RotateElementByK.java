package TufBasic;

public class RotateElementByK {

    public static void rotateElementRightByK(int arr[], int k) {

        // rotating arr to right by k element
        int lastIndex = arr.length - 1;
        int karr[] = new int[k];

        // storing the varibles whoes loctation changes on right rotation
        int index = 0;
        for (int i = lastIndex; i >= 0; i--) {
            if (index < k) {
                karr[index] = arr[i];
                index++;
            } else {
                break;
            }
        }

        // print(karr); ---- debug
        // System.out.println(" ");

        // changing loction of other ele
        for (int i = lastIndex; i >= 0; i--) {

            if (i - k >= 0) {
                arr[i] = arr[i - k];
            }
        }

        // placing variables in new loaction
        int last = karr.length - 1;
        for (int i = 0; i < k; i++) {
            arr[i] = karr[last];
            last--;
        }

        System.out.println("Rotated to right by k times : " + k);
        print(arr);
        System.out.println(" ");

    }

    // rotating array to left by k element
    public static void rotateElementLeftByK(int arr[], int k) {

        int lastIndex = arr.length - 1;

        // storing ele in var
        int karr[] = new int[k];

        for (int i = 0; i < k; i++) {
            karr[i] = arr[i];
        }
        // print(karr); ---- debuging
        // System.out.println(" ");

        // placing rest ele to correct spot
        for (int i = 0; i < arr.length; i++) {

            if (i + k < arr.length) {
                arr[i] = arr[i + k];
            }
        }

        // print(arr); ---- debuging
        // System.out.println(" ");

        // placing values of the stored variables
        int index = karr.length - 1;
        for (int i = lastIndex; i > lastIndex - k; i--) {
            arr[i] = karr[index];
            index--;
        }

        System.out.println(" Rotated left by k times : " + k);
        print(arr);
    }

    // ---------------------- program above -------------------
    public static void print(int arr[]) {

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;

        rotateElementRightByK(arr, k);
        rotateElementLeftByK(arr, k);
    }
}
