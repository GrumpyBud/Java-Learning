package inheritance.bonus;

public class ScoringRobot extends Robot {
	// Keep in mind this can be whatever two characteristics you want
	private double shooterSpeed; // RPM
	private double hoodAngle;    // degrees

	public ScoringRobot(String teamName, int teamNumber, double shooterSpeed, double hoodAngle) {
		super(teamName, teamNumber);
		this.shooterSpeed = shooterSpeed;
		this.hoodAngle = hoodAngle;
	}

	public double getShooterSpeed() {
		return shooterSpeed;
	}

	public void setShooterSpeed(double shooterSpeed) {
		this.shooterSpeed = shooterSpeed;
	}

	public double getHoodAngle() {
		return hoodAngle;
	}

	public void setHoodAngle(double hoodAngle) {
		this.hoodAngle = hoodAngle;
	}
}
