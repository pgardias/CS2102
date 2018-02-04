import java.util.LinkedList;
import java.util.GregorianCalendar;

public class WeatherMonitorList {
	private LinkedList<Report> reports = new LinkedList<>();

	WeatherMonitorList(LinkedList<Report> readings) {
		this.reports = readings;
	}

	// averageHighForMonth: takes a month and a year and produces the average
	// high temperature over all days of that month
	public double averageHighForMonth(int month, int year) {
		int accumulator = 0;
		int count = 0;
		for (Report report : reports) {
			if (report.date.get(GregorianCalendar.MONTH) == month && report.date.get(GregorianCalendar.YEAR) == year) {
				accumulator += report.getHigh().getTemperature();
				count++;
			}
		}
		if (count == 0) {
			return Double.NaN;
		} else {
			return accumulator / count;
		}
	}

	// averageLowForMonth: takes a month and a year and produces the average
	// low temperature over all days of that month
	public double averageLowForMonth(int month, int year) {
		int accumulator = 0;
		int count = 0;
		for (Report report : reports) {
			if (report.date.get(GregorianCalendar.MONTH) == month && report.date.get(GregorianCalendar.YEAR) == year) {
				accumulator += report.getLow().getTemperature();
				count++;
			}
		}
		if (count == 0) {
			return Double.NaN;
		} else {
			return accumulator / count;
		}
	}

	// addDailyReport: takes a date and a list of readings for the date and adds
	// the daily report which it computes to the list of reports which it stores
	public void addDailyReport(GregorianCalendar date, LinkedList<Reading> dailreadings) {
		int high = dailreadings.get(0).getTemperature();
		Time highTime = dailreadings.get(0).time;
		int low = dailreadings.get(0).getTemperature();
		Time lowTime = dailreadings.get(0).time;
		for (Reading reading : dailreadings) {
			if (reading.getTemperature() > high)
				high = reading.getTemperature();
			if (reading.getTemperature() < low)
				low = reading.getTemperature();
		}
		Report rep = new Report(date, new Reading(lowTime, low), new Reading(highTime, high));
		reports.add(rep);
	}

}
