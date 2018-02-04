
abstract class AbsEvent implements IEvent {
	double time;
	int position;
	
	AbsEvent(double time, int position) {
		this.time = time;
		this.position = position;
	}
}
