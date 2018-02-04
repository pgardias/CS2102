public class HeapTester {

	public HeapTester() {
	}

	// addEltTester: test if the addElt() method returns a correct general
	// answer
	boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
		if (!hAdded.hasElt(elt)) { // new element not added
			return false;
		}
		if (hAdded.getData() == -1 && hAdded.size() == 0) { // both nodes empty
			return false;
		} else { // check invariance and whether they contain the same elements
			return invarTest(hAdded) && sameHeap(hOrig, hAdded);
		}
	}

	// remMinEltTester: tests if the remMinElt() method returns a correct
	// general answer
	public boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
		if (hRemoved.getData() == -1 && hRemoved.size() == 0) {
			return false;
		} else { // check invariance and whether they contain the same elements
			return invarTest(hRemoved) && sameHeap(hOrig.remMinElt(), hRemoved);
		}
	}

	// invarTest: recursively checks invariance of the given tree to ascertain
	// that it is a heap
	boolean invarTest(IBinTree a) {
		if (a.getRight().getData() == -1 && a.getLeft().getData() == -1) {
			return true;
		}
		if (a.getRight().getData() == -1) {
			return a.getData() <= a.getLeft().getData() && invarTest(a.getLeft());
		}
		if (a.getLeft().getData() == -1) {
			return a.getData() <= a.getRight().getData() && invarTest(a.getRight());
		} else {
			return a.getData() <= a.getLeft().getData() && a.getData() <= a.getRight().getData()
					&& invarTest(a.getLeft()) && invarTest(a.getRight());
		}
	}

	// sameHeap: checks if the two trees are the same heap by recursively
	// passing through all elements
	boolean sameHeap(IBinTree a, IBinTree b) {
		if (a.getRight().getData() == -1 && a.getLeft().getData() == -1) {
			return true;
		}
		if (a.getRight().getData() == -1) {
			return a.getData() <= a.getLeft().getData() && invarTest(a.getLeft());
		}
		if (a.getLeft().getData() == -1) {
			return a.getData() <= a.getRight().getData() && invarTest(a.getRight());
		} else {
			return b.hasElt(a.getData()) && sameHeap(a.getLeft(), b) && sameHeap(a.getRight(), b);
		}
	}
}
