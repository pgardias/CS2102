import java.util.GregorianCalendar;

abstract class AbsReport {
	GregorianCalendar date;
	Reading low;
	Reading high;
	
	public AbsReport(GregorianCalendar date, Reading low, Reading high) {
		this.date = date;
		this.low = low;
		this.high = high;
	}
}
