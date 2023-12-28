package LeetCodeContest;

/**
 * operation to perform
 * ele >0 device ++
 * rest subtracted by 1
 */

public class DeviceTested {

    public static int deviceTested(int arr[]) {

        int device = 0;

        for (int i = 0; i < arr.length; i++) {

            int curr = arr[i];
            if (curr > 0) {
                device = device + 1;

                // sub 1 from others only happens when curr >0
                for (int j = i + 1; j < arr.length; j++) {

                    if (j != 0) {
                        arr[j] = arr[j] - 1;
                    }
                }
            }

        }

        System.out.println("No of device tested " + device);
        return device;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 1, 3 };

        deviceTested(arr);

    }

}
