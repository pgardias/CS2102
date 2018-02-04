import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

public class Planning {
	LinkedList<Double> rainfallReadings;
	double sum;
	
	public Planning(LinkedList<Double> rainfallReadings, double sum) {
		this.rainfallReadings = rainfallReadings;
		this.sum = sum;
	}

	// rainfall: given a LinkedList of doubles containing rainfall readings
	// return the average of the positive rainfall readings until the number
	// -999 is in the list
	public double rainfall() {
		double total = 0;
		double accumulator = 0;
		for (Double c : this.rainfallReadings) {
			if (c == -999) {
				return total / accumulator;
			} else if (c >= 0) {
				total += c;
				accumulator++;
			}
		}
		return -1;
	}

	public Planning rainfallSort() {
		LinkedList<Double> rainfallReadingsSorted = new LinkedList<Double>();
		Planning rainfallReadingsConst;
		for (Double c : this.rainfallReadings) {
			if (c >= 0 && c != -999) {
				rainfallReadingsSorted.add(c);
			} else if (c == -999) {
				rainfallReadingsConst = new Planning(rainfallReadingsSorted, 0.0);
				return rainfallReadingsConst;
			}
		}
		rainfallReadingsConst = new Planning(rainfallReadingsSorted, 0.0);
		return rainfallReadingsConst;
	}

	public double sumRainfallReadings(LinkedList<Double> rainfallReadingsSorted) {
		Planning rainfallReadingsSum = new Planning();
		double sum = 0;
		for (Double c : rainfallReadingsSorted) {
			sum += c;
		}
		return sum;
	}

	public int countRainfallReadings(LinkedList<Double> rainfallReadingsSorted) {
		return rainfallReadingsSorted.size();
	}

	public double avgRainfallReadings(double sum, int count) {
		return sum / count;
	}
}
