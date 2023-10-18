package Algorithm;

public class SieveOfErasthos {

    // algo
    public static int countPrimes(int n) {

        boolean prime[] = new boolean[n + 1];
        int count = 0;

        // setting all value to be true
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        // considering value to be true count++ setting multiple to 0
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;

                // setting multiple to be false
                for (int j = 2 * i; j < n; j = j + i) {
                    prime[j] = false;
                }
            }
        }
        return count;

    }

    public static void main(String args[]) {

        int result = countPrimes(40);
        System.out.println(result);
    }

}
