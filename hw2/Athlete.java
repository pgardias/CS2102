
public class Athlete {

	String name; // name of the athlete
	JumpingResult JR; // the jumpingResult object that the athlete has
	SkiingResult SR; // the skiingResult object that the athlete has

	// object constructor for Athlete
	public Athlete(String name, JumpingResult JR, SkiingResult SR) {
		this.name = name;
		this.JR = JR;
		this.SR = SR;
	}

	// betterJumper: takes another athlete object and compares jumpingResult
	// points earned to see who is the better jumper,
	// assuming there is no tie.
	Athlete betterJumper(Athlete other) {
		if (this.JR.pointsEarned() > other.JR.pointsEarned()) {
			return this;
		}
		return other;
	}

	// hasBeaten: takes another Athlete object (other) and returns true if:
	// the given Athlete has a better jumping result or a lower skiing result
	// than the other Athlete.
	boolean hasBeaten(Athlete other) {
		if ((this.JR.pointsEarned() > other.JR.pointsEarned()) || (this.SR.pointsEarned() < other.SR.pointsEarned())) {
			return true;
		}
		return false;
	}
}
