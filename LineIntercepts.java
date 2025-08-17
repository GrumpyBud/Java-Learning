public class LineIntercepts {
    public static void main(String[] args) {
        // Step 1: Define the slope (m) and y-intercept (b) of the line
        double m = 2; // Slope of the line
        double b = 4; // y-intercept

        // Step 2: y-intercept is simply b
        double yIntercept = b;

        /* Step 3: x-intercept is where y = 0
        Solve 0 = mx + b
              -b = mx
              -b / m = x
        */
        
        double xIntercept = -b / m;

        // Step 4: Print both intercepts
        System.out.println("y-intercept: " + yIntercept);
        System.out.println("x-intercept: " + xIntercept);
    }
}
