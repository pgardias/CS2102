import java.util.LinkedList;

class Earthquake2 {
	Earthquake2() {
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
				list.add(dayMax(data, i));
			}
		}
		return list;
	}

	// dayMax: given a list data in the form of doubles and an index value,
	// produces a MaxHzReport with the date and the maximum date value from that
	// date
	public MaxHzReport dayMax(LinkedList<Double> data, int index) {
		double date = data.get(index);
		double maxValue = 0.0;
		for (int i = index + 1; i < data.size(); i++) {
			if (isDate(data.get(i))) {
				return new MaxHzReport(date, maxValue);
			} else if (i == data.size() - 1) {
				if (data.get(i) > maxValue) {
					return new MaxHzReport(date, data.get(i));
				} else {
					return new MaxHzReport(date, maxValue);
				}

			} else if (data.get(i) > maxValue) {
				maxValue = data.get(i);
			}
		}
		return null;
	}
}