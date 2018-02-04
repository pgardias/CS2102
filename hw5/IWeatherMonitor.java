import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IWeatherMonitor {
	public double averageHighForMonth(int month, int year);

	public double averageLowForMonth(int month, int year);

	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> list);

}