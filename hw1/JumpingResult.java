
public class JumpingResult implements IEvent {

	JumpingRound round1;
	JumpingRound round2;
	JumpingRound round3;

	JumpingResult(JumpingRound round1, JumpingRound round2, JumpingRound round3) {
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
	}

	JumpingResult jumpingResult = new JumpingResult(round1, round2, round3);

	public double pointsEarned() {
		return (round1.points + round1.distance + round2.points + round2.distance + round3.points + round3.distance);
	}

	public JumpingResult bestRound() {
		if ((round1.points + round1.distance) > (round2.distance + round2.points)
				&& (round1.points + round1.distance) > (round3.distance + round3.points)) {
			return round3;
		} else if ((round2.points + round2.distance) > (round1.distance + round1.points)
				&& (round2.points + round2.distance) > (round3.distance + round3.points)) {
			return round2;
		} else {
			return round1;
		}
	}
}
