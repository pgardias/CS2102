import java.util.GregorianCalendar;

public class Report extends AbsReport {
	// public GregorianCalendar (int year, int month, int dayOfMonth)
	GregorianCalendar date;
	Reading low;
	Reading high;

	public Report(GregorianCalendar date, Reading low, Reading high) {
		super(date, low, high);
	}
	
	public GregorianCalendar getDate() {
		return date;
	}
	
	public int getMonth() {
		return this.date.MONTH;
	}
	
	public int getYear() {
		return this.date.YEAR;
	}
	
	public int getDay() {
		return this.date.DATE;
	}
	
	public Reading getHigh() {
		return high;
	}
	
	public Reading getLow() {
		return low;
	}
}
