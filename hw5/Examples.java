import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import java.util.LinkedList;

import org.junit.Test;

public class Examples {

	private WeatherMonitorList monitor;

	public Examples() {

		LinkedList<Report> reports = new LinkedList<Report>();

		GregorianCalendar date1 = new GregorianCalendar(2017, 3, 24);
		GregorianCalendar date2 = new GregorianCalendar(2017, 3, 20);
		GregorianCalendar date3 = new GregorianCalendar(2017, 3, 12);
		GregorianCalendar date4 = new GregorianCalendar(2017, 4, 20);
		GregorianCalendar date5 = new GregorianCalendar(2017, 4, 21);
		GregorianCalendar date6 = new GregorianCalendar(2017, 4, 30);
		GregorianCalendar date7 = new GregorianCalendar(2017, 3, 1);
		GregorianCalendar date8 = new GregorianCalendar(2017, 3, 2);
		GregorianCalendar date9 = new GregorianCalendar(2017, 3, 3);
		GregorianCalendar date10 = new GregorianCalendar(2017, 4, 4);
		GregorianCalendar date11 = new GregorianCalendar(2017, 4, 5);
		GregorianCalendar date12 = new GregorianCalendar(2017, 4, 6);

		Reading reading1High = new Reading(new Time(1, 41), 40);
		Reading reading1Low = new Reading(new Time(2, 45), 20);
		
		Reading reading2High = new Reading(new Time(3, 12), 42);
		Reading reading2Low = new Reading(new Time(4, 52), 30);
		
		Reading reading3High = new Reading(new Time(5, 32), 30);
		Reading reading3Low = new Reading(new Time(6, 13), 10);
		
		Reading reading4High = new Reading(new Time(7, 44), 50);
		Reading reading4Low = new Reading(new Time(8, 42), 45);
		
		Reading reading5High = new Reading(new Time(9, 23), 55);
		Reading reading5Low = new Reading(new Time(10, 42), 30);
		
		Reading reading6High = new Reading(new Time(11, 53), 56);
		Reading reading6Low = new Reading(new Time(12, 22), 40);
		
		Reading reading7High = new Reading(new Time(13, 12), 40);
		Reading reading7Low = new Reading(new Time(14, 23), 20);
		
		Reading reading8High = new Reading(new Time(15, 43), 42);
		Reading reading8Low = new Reading(new Time(16, 32), 30);
		
		Reading reading9High = new Reading(new Time(17, 41), 30);
		Reading reading9Low = new Reading(new Time(18, 55), 10);
		
		Reading reading10High = new Reading(new Time(19, 34), 50);
		Reading reading10Low = new Reading(new Time(20, 32), 45);
		
		Reading reading11High = new Reading(new Time(21, 38), 55);
		Reading reading11Low = new Reading(new Time(22, 38), 30);
		
		Reading reading12High = new Reading(new Time(23, 29), 56);
		Reading reading12Low = new Reading(new Time(12, 17), 40);

		reports.add(new Report(date1, reading1High, reading1Low));
		reports.add(new Report(date2, reading2High, reading2Low));
		reports.add(new Report(date3, reading3High, reading3Low));
		reports.add(new Report(date4, reading4High, reading4Low));
		reports.add(new Report(date5, reading5High, reading5Low));
		reports.add(new Report(date6, reading6High, reading6Low));
		reports.add(new Report(date7, reading7High, reading7Low));
		reports.add(new Report(date8, reading8High, reading8Low));
		reports.add(new Report(date9, reading9High, reading9Low));
		reports.add(new Report(date10, reading10High, reading10Low));
		reports.add(new Report(date11, reading11High, reading11Low));
		reports.add(new Report(date12, reading12High, reading12Low));
		
		monitor = new WeatherMonitorList(reports);

	}

	@Test
	public void testAverageHigh1() {
		assertEquals(monitor.averageHighForMonth(4, 2017), 56);
	}

	@Test
	public void testAverageHigh2() {
		assertEquals(monitor.averageHighForMonth(3, 2017), 37);
	}

	@Test
	public void testAverageLow1() {
		assertEquals(monitor.averageLowForMonth(3, 2017), 20);
	}

	@Test
	public void testAverageLow2() {
		assertEquals(monitor.averageLowForMonth(4, 2017), 30);
	}

}
