import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	HeapTester HT = new HeapTester();
	DataHeap myHeap1 = new DataHeap(20, new DataHeap(30, new DataHeap(40), new DataHeap(35)),
			new DataHeap(45, new DataHeap(47), new MtHeap()));
	// myHeap2 is not a proper heap, does not follow the invariant and
	// therefore does not pass the invarTest() method
	DataHeap myHeap2 = new DataHeap(30, new DataHeap(40, new DataHeap(35), new MtHeap()), new DataHeap(20));
	DataHeap myHeap3 = new DataHeap(10);
	DataHeap myHeap4 = new DataHeap(10, new MtHeap(), new DataHeap(20, new MtHeap(), new DataHeap(30)));

	public Examples() {
	}

	//
	// addEltTester Tests
	//
	@Test
	public void testAddEltTester1() {
		assertTrue(HT.addEltTester(myHeap1, 50, myHeap1.addElt(50)));
	}

	@Test
	public void testAddEltTester2() {
		assertTrue(HT.addEltTester(myHeap1, 10, myHeap1.addElt(10)));
	}

	@Test
	public void testAddEltTester3() {
		assertTrue(HT.addEltTester(myHeap1, 37, myHeap1.addElt(37)));
	}

	// test which uses improperly defined heap
	@Test
	public void testAddEltTester4() {
		assertFalse(HT.addEltTester(myHeap2, 25, myHeap1.addElt(37)));
	}

	@Test
	public void testAddEltTester5() {
		assertTrue(HT.addEltTester(myHeap4, 25, myHeap4.addElt(25)));
	}

	//
	// remMinEltTester Tests
	//
	@Test
	public void testRemMinEltTester1() {
		assertTrue(HT.remMinEltTester(myHeap1, myHeap1.remMinElt()));
	}

	// tests heap with only one node, which returns false since an empty heap
	// would be created
	@Test
	public void testRemMinEltTester2() {
		assertFalse(HT.remMinEltTester(myHeap3, myHeap3.remMinElt()));
	}

	@Test
	public void testRemMinEltTester3() {
		assertTrue(HT.remMinEltTester(myHeap4, myHeap4.remMinElt()));
	}

	// test which uses improperly defined heap
	@Test
	public void testRemMinEltTester4() {
		assertFalse(HT.remMinEltTester(myHeap2, myHeap2.remMinElt()));
	}
}
