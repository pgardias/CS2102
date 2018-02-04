import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class Examples {

	LinkedList<Double> rainfallReadings = new LinkedList<Double>();
	Planning rainfallReadingsConst = new Planning(rainfallReadings);

	@Test
	public void testRainfall() {
		rainfallReadings.add(1.0);
		rainfallReadings.add(-2.0);
		rainfallReadings.add(5.0);
		rainfallReadings.add(-999.0);
		rainfallReadings.add(9.0);
		assertEquals(rainfallReadingsConst.rainfall(), 3.0);
	}

	@Test
	public void testRainfallOOP() {s
		assertEquals(rainfallReadingsConst.rainfallSort.sumRainfallReadings
				.avgRainfallReadings(rainfallReadings.rainfallSort.countRainfallReadings), 3.0);
	}

}
