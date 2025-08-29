package arrays;

public class BlackJack {

    public static void main(String[] args) {
        // Create the array of values (scores).
        int[] values = {18, 19, 26, 16, 20, 23, 13, 30, 15, 28};

        // We want the largest value that is not over 21.
        final int limit = 21;

        // Track the best candidate seen so far. Start at the smallest int so any valid value will replace it.
        int best = Integer.MIN_VALUE;

        // Scan through the array and update 'best' when we find a better (larger) value that is <= LIMIT.
        for (int v : values) {
            if (v <= limit && v > best) {
                best = v;
            }
        }

        // Print the result. If best was never updated, then all values were over 21.
        if (best == Integer.MIN_VALUE) {
            System.out.println("No value at or under " + limit + " (all bust).");
        } else {
            System.out.println("Largest value not over " + limit + ": " + best);
        }
    }
}