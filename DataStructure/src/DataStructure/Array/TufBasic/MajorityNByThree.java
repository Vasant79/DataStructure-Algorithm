package TufBasic;

public class MajorityNByThree {

    // gives element appearinf more thaan n/3 times
    public static void majorityNByThree(int arr[]) {

        int n = arr.length;

        // more voting algo
        int count1 = 0;
        int count2 = 0;

        int ele1 = 0;
        int ele2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (count1 == 0 && ele2 != arr[i]) {
                count1 = 1;
                ele1 = arr[i];
            } else if (count2 == 0 && ele1 != arr[i]) {
                count2 = 1;
                ele2 = arr[i];
            } else if (arr[i] == ele1) {
                count1++;
            } else if (arr[i] == ele2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        if (count1 > n / 3) {
            System.out.println("Element with occurence > n/3 : " + ele1);
        }
        if (count2 > n / 3) {
            System.out.println("Element with occurence > n/3 : " + ele2);
        }

    }

    public static void main(String args[]) {

        int arr[] = { 11, 33, 33, 11, 33, 11 };

        majorityNByThree(arr);
    }

}
