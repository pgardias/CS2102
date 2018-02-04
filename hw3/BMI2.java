import java.util.LinkedList;

class BMI2 {
	BMI2() {
	}

	// BMISummary: given a set of personal health records, returns a BMI Summary
	// of four lists containing the names of patients who fall under a specific
	// BMI category
	public BMISummary bmiReport(LinkedList<PHR> phrs) {
		return new BMISummary(sortList(phrs, 0, 18.5), sortList(phrs, 18.5, 25), sortList(phrs, 25, 30),
				sortList(phrs, 30, 999));
	}

	// sortList: given a set of personal health records and a lower and upper
	// limit BMI, produces a list of names of patients with BMIs that fall
	// between the two given limits
	public LinkedList<String> sortList(LinkedList<PHR> phrs, double lowerLimit, double upperLimit) {
		LinkedList<String> list = new LinkedList<String>();
		for (PHR phr : phrs) {
			double BMI = calculateBMI(phr);
			if (BMI >= lowerLimit && BMI < upperLimit) {
				list.add(phr.name);
			}
		}
		return list;
	}

	// calculateBMI: given a personal health record, calculates BMI
	public double calculateBMI(PHR phr) {
		return phr.weight / (phr.height * phr.height);
	}
}