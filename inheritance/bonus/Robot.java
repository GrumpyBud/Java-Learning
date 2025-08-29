package inheritance.bonus;

public class Robot {
	private String teamName;
	private int teamNumber;

	public Robot(String teamName, int teamNumber) {
		this.teamName = teamName;
		this.teamNumber = teamNumber;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamNumber() {
		return teamNumber;
	}

	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}
}
