
class Fish extends AbsAnimal {
	double salinity;

	Fish(int length, double salinity) {
		super(length);
		this.salinity = salinity;
	}
	
	// determines whether the Fish's length is between 1 and 15
	public boolean isNormalSize() {
		return isLenWithin(1, 15);
	}

	// determines whether the animal is a boa that eats people or a shark that
	// has previously attacked someone
	public boolean isDangerousToPeople() {
		return false;
	}
}
