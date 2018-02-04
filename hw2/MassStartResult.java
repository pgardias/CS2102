
public class MassStartResult extends AbsEvent {
	double time;
	int position;
	
	MassStartResult(double time, int position) {
		super(time, position);
	}
	
	public double pointsEarned() {
		return this.time;
	}
}
