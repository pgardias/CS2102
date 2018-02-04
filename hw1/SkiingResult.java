
public class SkiingResult implements IEvent {

	double time; // time in seconds at which athlete crossed the finish line
	int position; // finishing position (e.g. 1 for 1st, 2 for 2nd, etc.)

	SkiingResult(double time, int position) {
		this.time = time;
		this.position = position;
	}

	public double pointsEarned() {
		if (this.position == 1) {
			return this.time - 10;
		} else if (this.position == 2) {
			return this.time - 7;
		} else if (this.position == 3) {
			return this.time - 3;
		} else {
			return this.time;
		}
	}
}
