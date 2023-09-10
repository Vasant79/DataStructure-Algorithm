package TufBasic;

public class ZeroToLeft {

    public static void zeroToLeft(int arr[]) {

        // note - to mantain order

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 0 && j + 1 < arr.length) {
                    // swap with adjucent
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = -temp;
                }

            }
        }

        print(arr);

    }

    // optimizing using 2 pointer
    public static void optimize(int arr[]) {

    }

    // ----------------- program above -----------------

    public static void print(int arr[]) {

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };

        zeroToLeft(arr);
    }

}
