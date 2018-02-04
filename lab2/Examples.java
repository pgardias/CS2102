import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

	public Examples() {
	}

	Shark shark1 = new Shark(16, 2);

	@Test
	public void testSharkIsNormalSize() {
		assertTrue(shark1.isNormalSize());
	}
}