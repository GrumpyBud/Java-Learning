package intro;

public class QuadraticZeroes {
    public static void main(String[] args) {
        // Step 1: Define the coefficients a, b, c of the quadratic equation ax^2 + bx + c = 0
        double a = 1;
        double b = -3;
        double c = 2;

        // Step 2: Calculate the discriminant (b^2 - 4ac)
        // If the discraminant is non-negative, real solutions exist. 
        // If it = 0, there is only one solution.
        
        double discriminant = b * b - 4 * a * c;

        // Step 3: Check if the discriminant is non-negative (ensures real solutions)
        if (discriminant >= 0) {
            // Step 4: Use the quadratic formula to find the two zeroes
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Step 5: Print the zeroes
            System.out.println("Zeroes of quadratic: " + root1 + " and " + root2);
        } else {
            // Step 6: If discriminant is negative, no real solutions exist
            System.out.println("No real solutions for the quadratic equation");
        }
    }
}
