package functions;

/**
 * Utility methods for determining if numbers are even or odd.
 * These methods work for zero and negative values.
 */
final class EvenOddUtil {
    // Test our Functions.
    public static void main(String[] args) {
        // Test the methods with a range of values.
        int[] testValues = {0, 1, -1, 2, -2, 3, -3, 10, -10, 15, -15, 100, -100};

        for (int n : testValues) {
            System.out.println(n + " is " + isEven(n));
        }
    }

    /**
     * Returns true if the given int is even (divisible by 2), false otherwise.
     */
    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}