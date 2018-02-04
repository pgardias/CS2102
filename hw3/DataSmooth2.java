import java.util.LinkedList;

class DataSmooth2 {
	DataSmooth2() {
	}

	// dataSmooth: given a set of personal health records, return a list of the
	// heart rates that are smoothed (averaged with the number before and after
	// them in the list)
	public LinkedList<Double> dataSmooth(LinkedList<PHR> phrs) {
		LinkedList<Double> listOfHeartRates = new LinkedList<Double>();
		for (PHR phr : phrs) {
			listOfHeartRates.add((double) phr.heartRate);
		}
		return smoothHeartRates(listOfHeartRates);
	}

	// smoothHeartRates: given a list of doubles returns a smoothed list (where
	// every value except for the first and last is averaged with the number
	// before and after it)
	public LinkedList<Double> smoothHeartRates(LinkedList<Double> listOfHeartRates) {
		LinkedList<Double> list = new LinkedList<Double>();
		list.addFirst(listOfHeartRates.getFirst());
		for (int i = 1; i < listOfHeartRates.size() - 1; i++) {
			list.add(i,
					averageOfThree(listOfHeartRates.get(i - 1), listOfHeartRates.get(i), listOfHeartRates.get(i + 1)));
		}
		list.addLast(listOfHeartRates.getLast());
		return list;
	}

	// averageOfThree: given three doubles, returns their average
	public double averageOfThree(double one, double two, double three) {
		return (one + two + three) / 3.0;
	}
}