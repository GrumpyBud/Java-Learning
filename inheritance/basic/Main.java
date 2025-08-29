
package inheritance.basic;

public class Main {
	public static void main(String[] args) {
		ScoringRobot bot = new ScoringRobot("Robonauts", 118, 4500.0, 30.0);

		// Access parent class fields via public variables
		System.out.println("Team: " + bot.teamName + " #" + bot.teamNumber);

		// Access child class fields via public variables
		System.out.println("Shooter speed: " + bot.shooterSpeed);
		System.out.println("Hood angle: " + bot.hoodAngle);

		// Update values via public variables
		bot.teamName = "Webb Robotics";
		bot.teamNumber = 1466;
		bot.shooterSpeed = 5000.0;
		bot.hoodAngle = 35.0;

		System.out.println("Updated Team: " + bot.teamName + " #" + bot.teamNumber);
		System.out.println("Updated Shooter speed: " + bot.shooterSpeed);
		System.out.println("Updated Hood angle: " + bot.hoodAngle);
	}
}