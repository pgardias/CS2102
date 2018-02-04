public class SkiingResult extends AbsEvent {
	// fields for SkiingResult
	double time; // time of the event
	int position; // position the athlete was in (1st, 2nd, 3rd etc.)

	// object constructor for SkiingResult
	public SkiingResult(double time, int position) {
		super(time, position);
	}

	// pointEarned: returns the points earned for this event, taking to account
	// the point reduction for each position given.
	public double pointsEarned() {
		if (this.position == 1) {
			return time - 10.0;
		} else if (this.position == 2) {
			return time - 7.0;
		} else if (this.position == 3) {
			return time - 3.0;
		}
		return time;
	}

}
