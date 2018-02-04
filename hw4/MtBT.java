class MtBT implements IBinTree {
	MtBT() {
	}

	// returns false since empty tree has no elements
	@Override
	public boolean hasElt(int e) {
		return false;
	}

	// returns 0 since empty tree has no elements
	@Override
	public int size() {
		return 0;
	}

	// returns 0 since empty tree has no branches
	@Override
	public int height() {
		return 0;
	}

	// returns 0 since empty tree has no data
	@Override
	public int getData() {
		return -1;
	}

	// returns null since empty tree has no left element
	@Override
	public IBinTree getLeft() {
		return null;
	}

	// returns null since empty tree has no right element
	@Override
	public IBinTree getRight() {
		return null;
	}
}