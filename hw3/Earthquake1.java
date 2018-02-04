import java.util.LinkedList;

class Earthquake1 {
	Earthquake1() {
	}

	// checks whether a datum is a date
	boolean isDate(double anum) {
		return (int) anum > 10000000;
	}

	// extracts the month from an 8-digit date
	int extractMonth(double dateNum) {
		return ((int) dateNum % 10000) / 100;
	}

	// dailyMaxForMonth: given a list data in the form of doubles and a month as
	// an integer, produces a list of frequency reports for dates during the
	// given month for which data exists
	public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
		LinkedList<MaxHzReport> list = new LinkedList<MaxHzReport>();
		for (int i = 0; i < data.size(); i++) {
			if (extractMonth(data.get(i)) == month) {
				double date = data.get(i);
				double max = -1.0;
				for (int j = i + 1; j < data.size() && isDate(data.get(j)) == false; j++) {
					if (data.get(j) > max) {
						max = data.get(j);
					}
				}
				MaxHzReport datum = new MaxHzReport(date, max);
				list.add(datum);
			}
		}
		return list;
	}
}
