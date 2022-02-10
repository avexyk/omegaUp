
package algoritmos;

import java.util.Arrays;
import java.util.Scanner;

public class Prime1 {

    static public int[] findPrimes(int max) {
        int[] primes = new int[max];
        int found = 0;
        boolean isPrime;

        // initial prime
        if (max > 2) {
            primes[found++] = 2;

            for (int x = 3; x <= max; x += 2) {
                isPrime = true; // prove it's not prime
                for (int i = 0; i < found; i++) {
                    isPrime = x % primes[i] != 0; // x is not prime if it is
                                                    // divisible by p[i]
                    if (!isPrime || primes[i] * primes[i] > x) {
                        break;
                    }
                }
                if (isPrime) {
                        primes[found++] = x; // add x to our prime numbers
                }
            }
        }

        return Arrays.copyOf(primes, found);
    }

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        int MAX_N = Integer.MAX_VALUE / 100;
        int n = 0;
        while (n <= 0 || n >= MAX_N) {
            System.out.print("Enter N: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("n must be greater than 0");
            }
            if (n >= MAX_N) {
                System.out.println("n must be smaller than " + MAX_N);
            }
        }
        int max = n * 100; // just find enough prime numbers....

        int[] primes = findPrimes(max);
        System.out.println("Number of prime numbers found from " + 0 + " to "
                + max + " = " + primes.length);
        System.out.println("The " + n
                + (n == 1 ? "st" : n == 2 ? "nd" : n == 3 ? "rd" : "th")
                + " prime number is : " + primes[n - 1]);

    }
}
