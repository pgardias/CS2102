class DataBT implements IBinTree {
	int data;
	IBinTree left;
	IBinTree right;

	DataBT(int data, IBinTree left, IBinTree right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// an alternate constructor for when both subtrees are empty
	DataBT(int data) {
		this.data = data;
		this.left = new MtBT();
		this.right = new MtBT();
	}

	// determines whether this node or node in subtree has given element
	@Override
	public boolean hasElt(int e) {
		return this.data == e || this.left.hasElt(e) || this.right.hasElt(e);
	}

	// adds 1 to the number of nodes in the left and right subtrees
	@Override
	public int size() {
		return 1 + this.left.size() + this.right.size();
	}

	// adds 1 to the height of the taller subtree
	@Override
	public int height() {
		return 1 + Math.max(this.left.height(), this.right.height());
	}

	// returns the piece of data in the node
	@Override
	public int getData() {
		return this.data;
	}

	// returns the left piece of data as a IBinTree
	@Override
	public IBinTree getLeft() {
		return this.left;
	}

	// returns the right piece of data as a IBinTree
	@Override
	public IBinTree getRight() {
		return this.right;
	}
}