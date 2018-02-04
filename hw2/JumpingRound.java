public class JumpingRound {
	// fields for JumpingRound
	double stylePoints;
	double distance;

	// object constructor for JumpingRound
	public JumpingRound(double stylePoints, double distance) {
		this.distance = distance;
		this.stylePoints = stylePoints;
	}

	// totalPoints helper: returns the total points for this round, which is
	// just the sum of the stylePoints and distance.
	public double totalPoints() {
		return this.stylePoints + this.distance;
	}
}
