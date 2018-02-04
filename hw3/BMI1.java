import java.util.LinkedList;

class BMI1 {
	BMI1() {
	}

	// BMISummary: given a set of personal health records, returns a BMI Summary
	// of four lists containing the names of patients who fall under a specific
	// BMI category
	public BMISummary bmiReport(LinkedList<PHR> phrs) {
		LinkedList<String> under = new LinkedList<String>();
		LinkedList<String> healthy = new LinkedList<String>();
		LinkedList<String> over = new LinkedList<String>();
		LinkedList<String> obese = new LinkedList<String>();
		double BMI = 0;
		for (PHR phr : phrs) {
			BMI = phr.weight / (phr.height * phr.height);
			if (BMI < 18.5) {
				under.add(phr.name);
			} else if (BMI < 25) {
				healthy.add(phr.name);
			} else if (BMI < 30) {
				over.add(phr.name);
			} else {
				obese.add(phr.name);
			}
		}
		return new BMISummary(under, healthy, over, obese);
	}
}