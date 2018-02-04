
class Shark extends Fish {
	int attacks;

	Shark(int length, int attacks) {
		super(length, 3.75);
		this.attacks = attacks;
	}

	// determines whether the shark's size is greater than 6
	public boolean isNormalSize() {
		return this.length >= 6;
	}

	// determines whether the animal is a boa that eats people or a shark that
	// has previously attacked someone
	public boolean isDangerousToPeople() {
		return this.attacks > 0;
	}
}