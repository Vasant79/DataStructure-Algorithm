package TufBasic;

public class LeftShift {

    public static void leftShift(int arr[]) {

        int temp = arr[0];

        // itr arr ans assin i-1 the value of i
        for (int i = 1; i < arr.length; i++) {

            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        print(arr);

    }

    // printing arr
    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    // ----------------- prohram above --------------
    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };

        leftShift(arr);
    }

}
