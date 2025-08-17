package  Intro;

public class TimeConversion {
    public static void main(String[] args) {
        // Step 1: Total number of seconds
        int totalSeconds = 1466;

        // Step 2: Calculate minutes using integer division
        int minutes = totalSeconds / 60;

        // Step 3: Calculate remaining seconds using modulo (%)
        int seconds = totalSeconds % 60;

        // Step 4: Print the result
        System.out.println(totalSeconds + " seconds is " + minutes + " minutes and " + seconds + " seconds");
    }
}
