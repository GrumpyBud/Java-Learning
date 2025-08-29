package arrays;

public class MaxValue {

    public static void main(String[] args) {

        // 1) Create an array with at least 3 integers.
        // You can change these numbers to test different cases (including negatives and duplicates).
        int[] numbers = {42, -7, 13, 42, 5};

        // Optional: Print the entire array so you can see what we're working with.
        System.out.println("Input array: " + numbers);

        // 2) Find the largest value using an index-based for loop.
        // Why start with numbers[0]?
        // - We need a valid starting point from the array itself.
        // - This also works correctly even if all numbers are negative.
        int maxValue = numbers[0]; // current best (largest) value we've seen
        int maxIndex = 0;          // where we found that best value

        // Start at index 1 because index 0 is our initial assumption.
        for (int i = 1; i < numbers.length; i++) {
            // If we find a larger number, update both the value and its index.
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
            // Note: using '>' (not '>=') keeps the first occurrence in case of ties.
        }

        // 3) Print the result.
        System.out.println("Largest value (via index loop): " + maxValue + " at index " + maxIndex);

        // 4) Alternative approach: enhanced-for loop (when you don't need the index).
        // - This style is cleaner but doesn't directly give you the index.
        int altMax = Integer.MIN_VALUE; // the smallest possible int as a safe starting point
        for (int value : numbers) {
            // Math.max returns the larger of the two arguments.
            altMax = Math.max(altMax, value);
        }
        System.out.println("Largest value (via enhanced-for + Math.max): " + altMax);

        // Summary:
        // - Edit the 'numbers' array to try different inputs.
        // - Use the index-based loop if you need the position of the largest element.
        // - Use the enhanced-for loop if you only need the largest value.
    }
}