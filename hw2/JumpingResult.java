import java.util.LinkedList;

public class JumpingResult implements IEvent {

	LinkedList<JumpingRound> jumpingResult;

	// JumpingResult LinkedList constructor
	public void jumpingResult(LinkedList<JumpingRound> jumpingResult) {
		this.jumpingResult = jumpingResult;
	}

	// pointsEarned: returns the total points earned over the 3 rounds.
	public double pointsEarned() {
		int pointsEarned = 0;
		for (JumpingRound r : this.jumpingResult) {
			pointsEarned += r.stylePoints + r.distance;
		}
		return pointsEarned;
	}

	// bestRound: returns the best round (meaning the round with the most
	// points, or in a tie, the one the was first)
	public JumpingRound bestRound() {
		JumpingRound bestRound = this.jumpingResult.getFirst();
		for (JumpingRound r : this.jumpingResult) {
			if (r.totalPoints() > bestRound.totalPoints()) {
				bestRound = r;
			}
		}
		return bestRound;
	}
}
