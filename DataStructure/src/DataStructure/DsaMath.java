package DataStructure;

public class DsaMath {

    // prime no
    public static void isPrime(int n) {

        int i = 2;

        // prime no has only 2 divisor
        while (i < n) {
            if (n % i == 0) {
                System.out.println("Not a prime no");
                return;
            }
            i++;
        }

        System.out.println("Prime No");
    }

    // seive of erastos
    public static void sieveAlog(int n) {

        boolean primeList[] = new boolean[n + 1];
        int count = 0;

        // considering no. to be prime
        for (int i = 0; i < n; i++) {
            primeList[i] = true;
        }

        // making 0 & 1 false
        primeList[0] = primeList[1] = false;

        for (int i = 2; i < n; i++) {
            if (primeList[i]) {
                System.out.println(i + " ");
                count++;

                // eleminating its multiple
                for (int j = 2 * i; j < n; j = j + i) {
                    primeList[j] = false;
                }
            }

        }
        System.out.println("Count of Prime Number : " + count);

    }

    // gcd or hcf iterative approch ----- relation betwen lcm , hcf and no is -->
    // lcm(a,b) * hcf(a,b) = a*b ---- gcd(a-b,b) or gcd(a%b,b)
    public static int gcd(int a, int b) {

        if (a == 0) {
            return b;
        }

        while (a != b) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    // fast exopnentiation
    public static void power(int x, int y, int z) {
        int ans = (int) Math.pow(x, y);
        System.out.println(ans % z);
    }

    public static int fastExpo(int x, int y, int m) {
        int result = 1;

        // checking for power
        while (y > 0) {

            // power odd
            if ((y & 1) != 0) {
                result = ((result % m) * (x % m)) % m;
            }

            // in even
            y = y >> 1; // y --> y/2
            x = x * x; // x --> x^2

        }

        return result;
    }

    // finding factorial
    public static void factorial(int n, int m) {

        int result = 1;

        // factorial --> multiple all no from 1 to n
        for (int i = 2; i <= n; i++) {
            // prevents from over flow --> %m means whatever the result it will be < m
            result = (result * i) % m;
        }
        System.out.println(result);
    }

    // ------------------------------ Program above this section -----------

    public static void main(String args[]) {
        // isPrime(2);
        // sieveAlog(1);

        // int a = 45;
        // int b = 70;

        // System.out.println(gcd(a, b));

        // int x = 2;
        // int y = 5;
        // int z = 13;
        // System.out.println(fastExpo(x, y, z));

        int n = 21;
        int m = 79;
        factorial(n, m);

    }

}
