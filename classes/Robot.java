package classes;

public class Robot {
    // Public fields
    public String teamName;
    public int teamNumber;

    // Private fields
    private int algaeScored;
    private boolean climbed;

    // Constructor: sets team name and number
    public Robot(String teamName, int teamNumber) {
        this.teamName = teamName;
        this.teamNumber = teamNumber;
        this.algaeScored = 0;
        this.climbed = false;
    }

    // Increase algae scored by the given count (non-negative)
    public void addAlgae(int count) {
        if (count < 0) return; // ignore negative input
        this.algaeScored += count;
    }

    // Set whether the robot has climbed
    public void setClimbed(boolean climbed) {
        this.climbed = climbed;
    }

    // Total points: algae (4 pts each) + climb (12 pts if climbed)
    public int getTotalPoints() {
        int algaePoints = this.algaeScored * 4;
        int climbPoints = this.climbed ? 12 : 0; // The question mark represents an inline if statement. climbed? 12. otherwise (:), 0.
        return algaePoints + climbPoints;
    }
}
