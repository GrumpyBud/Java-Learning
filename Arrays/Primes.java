package arrays;

import java.util.ArrayList;

public class Primes {

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int n = 0; n <= 50; n++) {
            // We create a method called isPrime lower down
            if (isPrime(n)) {
                primes.add(n);
            }
        }

        System.out.println("Prime numbers from 0 to 50: " + primes);
    }

    // A prime number has exactly two factors: 1 and itself.
    private static boolean isPrime(int n) {
        if (n < 2) return false;       // 0 and 1 are not prime
        if (n == 2) return true;       // 2 is the only even prime
        if (n % 2 == 0) return false;  // exclude other even numbers

        // Check only odds starting at 3.
        // Only need to test up to sqrt(n): if a factor > sqrt(n) exists, a paired factor < sqrt(n) also exists.
        // Using i*i <= n is equivalent to i <= Math.sqrt(n) but avoids repeated square-root calls.
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false; // Found a divisor, so not prime
        }
        return true;
    }
}