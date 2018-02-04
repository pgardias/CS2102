import java.util.LinkedList;

class DataSmooth1 {
	DataSmooth1() {
	}

	// dataSmooth: given a set of personal health records, return a list of the
	// heart rates that are smoothed (averaged with the number before and after
	// them in the list)
	public LinkedList<Double> dataSmooth(LinkedList<PHR> phrs) {
		LinkedList<Double> list = new LinkedList<Double>();
		list.addFirst((double) phrs.getFirst().heartRate);
		for (int i = 1; i < phrs.size() - 1; i++) {
			list.add(i, (double) (phrs.get(i - 1).heartRate + phrs.get(i).heartRate + phrs.get(i + 1).heartRate) / 3.0);
		}
		list.addLast((double) phrs.getLast().heartRate);
		return list;
	}
}