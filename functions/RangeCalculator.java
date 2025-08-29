package functions;

public class RangeCalculator {
    private static final double MILES_TO_KM = 1.60934;

    static double milesToKilometers(double miles) {
        return miles * MILES_TO_KM;
    }

    static double rangeKilometers(double gallons, double mpg) {
        double miles = gallons * mpg;
        return milesToKilometers(miles);
    }
    
    public static void main(String[] args) {
        printResult(13.2, 31.0);
        printResult(20.0, 18.0);
        printResult(19.0, 15.71);
    }

    private static void printResult(double gallons, double mpg) {
        double km = rangeKilometers(gallons, mpg);
        System.out.println("Fuel: " + gallons + " g, Efficiency: " + mpg + " mpg, Range: " + km + " km");
    }
}