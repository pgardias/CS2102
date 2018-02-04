import static org.junit.Assert.*;
import org.junit.Test;

// Lab 1
// Przemek Gardias
// pmgardias@wpi.edu

public class Examples {

	Album blond = new Album("Frank Ocean", "R&B");

	Song Nights = new Song("Nights", 307, blond);
	Song PinkWhite = new Song("Pink + White", 184, blond);

	public Examples() {

	}

	@Test

	public void checkNightsLen() {
		assertEquals(307, Nights.lenInSeconds);
	}
	
	@Test
	
	public void checkPinkWhiteLen() { // this test should fail
		assertEquals(180, PinkWhite.lenInSeconds);
	}
	
	@Test
	
	public void checkNightsGenre() {
		assertEquals("R&B", PinkWhite.onAlbum.genre);
	}

	/*
	 * // This shows what a test case looks like
	 * 
	 * @Test public void simpleCheck() { assertEquals(4, 4); }
	 */

}
