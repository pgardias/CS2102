import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor implements IWeatherMonitor {
	private IWeatherMonitor report;

	public WeatherMonitor(IWeatherMonitor report) {
		this.report = report;
	}

	// averageHighForMonth: takes a month and a year and produces the average
	// high temperature over all days of that month
	public double averageHighForMonth(int month, int year) {
		return report.averageHighForMonth(month, year);
	}

	// averageLowForMonth: takes a month and a year and produces the average
	// low temperature over all days of that month
	public double averageLowForMonth(int month, int year) {
		return report.averageLowForMonth(month, year);
	}

	// addDailyReport: takes a date and a list of readings for the date and adds
	// the daily report which it computes to the list of reports which it stores
	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> list) {
		report.addDailyReport(date, list);
	}
}
