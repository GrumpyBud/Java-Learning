package arrays;

import java.util.ArrayList;

/* Compute the average (arithmetic mean) of a list of doubles. */
class AverageValue {
    public static void main(String[] args) {
        // Build a list of sample double values.
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.5);
        numbers.add(7.3);
        numbers.add(9.2);
        numbers.add(4.0);
        numbers.add(12.8);
        numbers.add(6.7);
        numbers.add(3.3);
        numbers.add(8.5);

        // Sum all values using an enhanced-for loop.
        double sum = 0.0;
        for (double d : numbers) {
            sum += d;
        }

        // Compute the mean (sum divided by the number of elements).
        double average = sum / numbers.size();

        // Print the average.
        System.out.println("Average: " + average);
    }
}
