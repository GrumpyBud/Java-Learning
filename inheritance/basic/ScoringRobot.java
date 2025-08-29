package inheritance.basic;

public class ScoringRobot extends Robot {
	// Keep in mind this can be whatever two characteristics you want
	public double shooterSpeed; // RPM
	public double hoodAngle;    // degrees

	public ScoringRobot(String teamName, int teamNumber, double shooterSpeed, double hoodAngle) {
		super(teamName, teamNumber);
		this.shooterSpeed = shooterSpeed;
		this.hoodAngle = hoodAngle;
	}
}
