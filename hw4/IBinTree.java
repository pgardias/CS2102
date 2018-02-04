interface IBinTree {
	// determines whether element is in the tree
	boolean hasElt(int e);

	// returns number of nodes in the tree; counts duplicate elements as
	// separate items
	int size();

	// returns depth of longest branch in the tree
	int height();
	
	// returns the data at the node
	int getData();
	
	// returns the left piece of data
	IBinTree getLeft();
	
	// returns the right piece of data,
	IBinTree getRight();
}
