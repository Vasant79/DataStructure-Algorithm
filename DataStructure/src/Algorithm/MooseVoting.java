package Algorithm;

public class MooseVoting {
    public static void mooseVoting(int arr[]) {

        int ele = -1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {
                count++;
                ele = arr[i];
            } else if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        // System.out.println(ele);

        // now checking if the last standing element is more than n/2
        int occurence = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                occurence++;
            }
            if (occurence > arr.length / 2) {
                System.out.println(ele);
                break;
            }
        }

    }

    public static void main(String args[]) {

        // note -- you vote for a ele by inc count if ele differ count--
        // if array contains ele than occurs more time than must be the remaining ele

        int arr[] = { 3, 2, 3 };

        mooseVoting(arr);
    }

}
