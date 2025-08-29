
package inheritance.bonus;

public class Main {
	public static void main(String[] args) {
		ScoringRobot bot = new ScoringRobot("Orbit", 1690, 4500.0, 30.0);

		// Access parent class fields via getters
		System.out.println("Team: " + bot.getTeamName() + " #" + bot.getTeamNumber());

		// Access child class fields via getters
		System.out.println("Shooter speed: " + bot.getShooterSpeed());
		System.out.println("Hood angle: " + bot.getHoodAngle());

		// Update values via setters
		bot.setTeamName("Mechanical Advantage");
		bot.setTeamNumber(6328);
		bot.setShooterSpeed(5000.0);
		bot.setHoodAngle(35.0);

		System.out.println("Updated Team: " + bot.getTeamName() + " #" + bot.getTeamNumber());
		System.out.println("Updated Shooter speed: " + bot.getShooterSpeed());
		System.out.println("Updated Hood angle: " + bot.getHoodAngle());

		// Bonus note: direct field access won't compile because fields are private:
		// bot.teamName = "Nope";
		// bot.shooterSpeed = 0;
	}
}