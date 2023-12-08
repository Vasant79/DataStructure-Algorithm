package DataStructure.Queue;

public class NextGreaterSecond {

    public static int[] nextGreater(int arr[]) {
        int result[] = new int[arr.length * 2];

        for (int i = 0; i < arr.length * 2; i = (i + 1) % arr.length) {

            System.out.print(arr[i] + " ");

        }

        return result;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 1 };

        nextGreater(arr);
    }

}
