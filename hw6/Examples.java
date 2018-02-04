import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {
	ElectionData Setup1() {
		ElectionData ED = new ElectionData();

		try {
			ED.addCandidate("Gompei");
			ED.addCandidate("Husky");
			ED.addCandidate("Ziggy");
		} catch (Exception CandidateExistsException) {

		}

		try {
			ED.processVote("Gompei", "Husky", "Ziggy");
			ED.processVote("Gompei", "Ziggy", "Husky");
			ED.processVote("Husky", "Gompei", "Ziggy");
		} catch (Exception e) {

		}
		return (ED);
	}

	ElectionData Setup2() {
		// Each candidate has the same number of points when looking at all
		// votes.
		ElectionData ED = new ElectionData();

		try {
			ED.addCandidate("Trump");
			ED.addCandidate("Rubio");
			ED.addCandidate("Clinton");
		} catch (Exception CandidateExistsException) {

		}

		try {
			ED.processVote("Trump", "Rubio", "Clinton");
			ED.processVote("Rubio", "Trump", "Clinton");
			ED.processVote("Clinton", "Rubio", "Trump");
			ED.processVote("Clinton", "Trump", "Rubio");
		} catch (Exception e) {

		}
		return (ED);
	}

	ElectionData Setup3() {
		// Each candidate has the same number of votes when looking at first
		// votes.
		ElectionData ED = new ElectionData();

		try {
			ED.addCandidate("Bush");
			ED.addCandidate("Kerry");
			ED.addCandidate("Nader");
		} catch (Exception CandidateExistsException) {

		}

		try {
			ED.processVote("Bush", "Nader", "Kerry");
			ED.processVote("Kerry", "Bush", "Nader");
		} catch (Exception e) {

		}
		return (ED);
	}

	@Test
	public void testMostFirstWinner() {
		assertEquals("Gompei", Setup1().findWinnerMostFirstVotes());
	}

	@Test
	public void testWinnerMostPoints() {
		assertEquals("Gompei", Setup1().findWinnerMostPoints());
	}

	@Test
	public void testMostFirstWinner2() {
		assertEquals("Clinton", Setup2().findWinnerMostFirstVotes());
	}

	@Test
	public void testWinnerMostPoints2() {
		// findWinnerMostPoints could return any candidate to successfully run
		// but instead returns "Trump" in this case as he is the first candidate
		// which is added to the ballot and is therefore the first candidate to
		// be tested by the method to have the most points.
		assertEquals("Trump", Setup2().findWinnerMostPoints());
	}

	@Test
	public void testMostFirstWinner3() {
		// same situation as above, either "Bush" or "Kerry" would be a valid
		// result, but "Bush" was returned because of the order in which
		// candidates were added to the ballet and then sorted through.
		assertEquals("Bush", Setup3().findWinnerMostFirstVotes());
	}

	@Test
	public void testWinnerMostPoints3() {
		// same situation as above, either "Bush" or "Kerry" would be a valid
		// result, but "Bush" was returned because of the order in which
		// candidates were added to the ballet and then sorted through.
		assertEquals("Bush", Setup3().findWinnerMostPoints());
	}
}
