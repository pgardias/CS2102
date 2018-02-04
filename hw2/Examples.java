import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class Examples {

	// setup
	JumpingRound jumpingRound1 = new JumpingRound(1, 0.5);
	JumpingRound jumpingRound2 = new JumpingRound(3, 5.0);
	JumpingRound jumpingRound3 = new JumpingRound(2, 1.2);
	JumpingRound jumpingRound4 = new JumpingRound(5, 0.24);
	JumpingRound jumpingRound5 = new JumpingRound(3, 7.31);
	JumpingRound jumpingRound6 = new JumpingRound(7, 5.3);
	
	LinkedList<JumpingRound> jumpingResult1 = new LinkedList<JumpingRound>();
	LinkedList<JumpingRound> jumpingResult2 = new LinkedList<JumpingRound>();
	LinkedList<JumpingRound> jumpingResult3 = new LinkedList<JumpingRound>();
	//JumpingResult jumpingResult1 = new JumpingResult(jumpingRound1, jumpingRound2, jumpingRound3);
	//JumpingResult jumpingResult2 = new JumpingResult(jumpingRound4, jumpingRound5, jumpingRound6);
	//JumpingResult jumpingResult3 = new JumpingResult(jumpingRound1, jumpingRound5, jumpingRound3);

	SkiingResult skiingResult1 = new SkiingResult(2.2, 6);
	SkiingResult skiingResult2 = new SkiingResult(5.4, 10);
	SkiingResult skiingResult3 = new SkiingResult(1.3, 2);

	public Athlete athlete1 = new Athlete("Joe", jumpingResult1, skiingResult1);
	public Athlete athlete2 = new Athlete("Bob", jumpingResult2, skiingResult2);
	public Athlete athlete3 = new Athlete("Ryan", jumpingResult3, skiingResult3);

	@Test
	public void testPointsEarnedJR() {
		assertEquals(jumpingResult1.pointsEarned(), 12.7, 0.01);
	}

	@Test
	public void testPointsEarnedSR() {
		assertEquals(skiingResult1.pointsEarned(), 2.2, 0.01);
	}

	@Test
	public void testBestRound() {
		assertEquals(jumpingResult1.bestRound(), jumpingRound2);
	}

	@Test
	public void testBetterJumper() {
		assertEquals(athlete2, athlete1.betterJumper(athlete2));
	}

	@Test
	public void testHasBeaten() {
		assertTrue(athlete1.hasBeaten(athlete2));
	}

	@Test
	public void testPointsEarned() {
		assertEquals(jumpingResult3.pointsEarned(), 15.01, 0.01);
	}

}