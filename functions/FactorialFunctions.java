package functions;

/**
 * Utility methods for computing factorials.
 * Includes a simple demo in main.
 */
public class FactorialFunctions {

    public static void main(String[] args) {
        int[] input = {0, 1, 2, 3, 4, 5};
        double[] output = factorialArray(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + "! = " + output[i]);
        }
    }

    /**
     * Returns a new array where each element is the factorial of the
     * corresponding element in the input array.
     *
     * @param numbers array of integers (must be non-negative)
     * @return array of factorials as doubles
     * @throws IllegalArgumentException if numbers is null or contains a negative value
     */
    public static double[] factorialArray(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
        double[] result = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = factorial(numbers[i]);
        }
        return result;
    }

    /**
     * Computes n! iteratively.
     * 0! and 1! are 1. Negative inputs are not allowed.
     *
     * Note: Factorials grow quickly and may overflow double for larger n.
     *
     * @param n non-negative integer
     * @return n! as a double
     * @throws IllegalArgumentException if n is negative
     */
    public static double factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative integers: " + n);
        }
        double product = 1.0;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
