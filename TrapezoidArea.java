public class TrapezoidArea {
    public static void main(String[] args) {
        // Step 1: Declare variables for the two bases and the height
        double base1 = 14; // First base of the trapezoid
        double base2 = 6;  // Second base of the trapezoid
        double height = 6; // Height of the trapezoid

        // Step 2: Calculate the area
        // Formula: (base1 + base2) / 2 * height
        double area = (base1 + base2) / 2 * height;

        // Step 3: Print the result to the console
        System.out.println("Trapezoid area: " + area);
    }
}
