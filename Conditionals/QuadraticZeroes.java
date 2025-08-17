package Conditionals;

public class QuadraticZeroes {
    public static void main(String[] args) {
        // Step 1: Define the coefficients of the quadratic equation ax^2 + bx + c = 0
        double a = 1;
        double b = -3;
        double c = 2;

        // Step 2: Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Step 3: Determine the number of real roots
        String numRoots;
        if (discriminant > 0) {
            numRoots = "Two real roots";
        } else if (discriminant == 0) {
            numRoots = "One real root";
        } else {
            numRoots = "No real roots";
        }

        // Step 4: Determine the parabola's direction
        String parabolaDirection;
        if (a > 0) {
            parabolaDirection = "Opens up";
        } else if (a < 0) {
            parabolaDirection = "Opens down";
        } else {
            parabolaDirection = "Not a parabola";
        }

        // Step 5: Calculate zeroes if real solutions exist
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Zeroes of quadratic: " + root1 + " and " + root2);
        } else {
            System.out.println("No real solutions for the quadratic equation");
        }

        // Step 6: Print summary
        System.out.println("Number of roots: " + numRoots);
        System.out.println("Parabola direction: " + parabolaDirection);
    }
}
