
public class Reading {
	Time time;
	private int temperature;

	public Reading(Time time, int temperature) {
		this.time = time;
		this.temperature = temperature;
	}
	
	// getter for private int temperature
	public int getTemperature() {
		return this.temperature;
	}
}
