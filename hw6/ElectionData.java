import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;

class ElectionData implements IElectionData {
	private LinkedList<String> ballot = new LinkedList<String>();
	private LinkedList<String> votes = new LinkedList<String>();

	private HashMap<String, Integer> firstChoice = new HashMap<String, Integer>();
	private HashMap<String, Integer> secondChoice = new HashMap<String, Integer>();
	private HashMap<String, Integer> thirdChoice = new HashMap<String, Integer>();

	Scanner keyboard = new Scanner(System.in);

	ElectionData() {
		//this.ballot.add("Gompei");
		//this.ballot.add("Husky");
	}

	public void printBallot() {
		System.out.println("The candidates are ");
		for (String s : ballot) {
			System.out.println(s);
		}
	}

	public void screen() {
		this.printBallot();
		System.out.println("Who do you want to vote for?");
		String candidate = keyboard.next();
		votes.add(candidate);
		System.out.println("You voted for " + candidate);
	}

	// processVote: takes three strings that represent the three votes and
	// stores the votes in the data structure
	public void processVote(String firstVoteCandidate, String secondVoteCandidate, String thirdVoteCandidate)
			throws UnknownCandidateException, DuplicateVotesException {
		if (!ballot.contains(firstVoteCandidate)) {
			throw new UnknownCandidateException(firstVoteCandidate);
		} else if (!ballot.contains(secondVoteCandidate)) {
			throw new UnknownCandidateException(secondVoteCandidate);
		} else if (!ballot.contains(thirdVoteCandidate)) {
			throw new UnknownCandidateException(thirdVoteCandidate);
		} else if (firstVoteCandidate.equals(secondVoteCandidate) || firstVoteCandidate.equals(thirdVoteCandidate)) {
			throw new DuplicateVotesException(firstVoteCandidate);
		} else if (secondVoteCandidate.equals(thirdVoteCandidate)) {
			throw new DuplicateVotesException(secondVoteCandidate);
		} else {
			int firstVoteCount = firstChoice.get(firstVoteCandidate);
			firstChoice.replace(firstVoteCandidate, firstVoteCount + 1);

			int secondVoteCount = secondChoice.get(secondVoteCandidate);
			secondChoice.replace(secondVoteCandidate, secondVoteCount + 1);

			int thirdVoteCount = thirdChoice.get(thirdVoteCandidate);
			thirdChoice.replace(thirdVoteCandidate, thirdVoteCount + 1);
		}
	}

	// addCandidate: takes a string and adds the candidate to the ballot. If
	// candidate was already on the ballot, throws a CandidateExistsException
	public void addCandidate(String candidate) throws CandidateExistsException {
		if (!ballot.contains(candidate)) {
			ballot.addLast(candidate);
			// add candidate to HashMaps with 0 as they're vote value
			firstChoice.put(candidate, 0);
			secondChoice.put(candidate, 0);
			thirdChoice.put(candidate, 0);
		} else {
			throw new CandidateExistsException(candidate);
		}
	}

	// findWinnerMostFirstVotes: returns the candidate with the most first votes
	public String findWinnerMostFirstVotes() {
		String winner = "";
		int winnerVotes = 0;
		for (String candidate : ballot) {
			if (firstChoice.get(candidate) > winnerVotes) {
				winner = candidate;
				winnerVotes = firstChoice.get(candidate);
			}
		}
		return winner;
	}

	// findWinnerMostPoints: returns the winner according to the following
	// formula: three points for each first-place vote they received, two points
	// for each second-place vote they received, and one point for each
	// third-place vote they received.
	public String findWinnerMostPoints() {
		String winner = "";
		int winnerVotes = 0;
		for (String candidate : ballot) {
			if (countTotalVotes(candidate) > winnerVotes) {
				winner = candidate;
				winnerVotes = countTotalVotes(candidate);
			}
		}
		return winner;
	}

	// countTotalVotes: return the total votes for the candidate according to
	// the following formula: three points for each first-place vote they
	// received, two points for each second-place vote they received, and one
	// point for each third-place vote they received
	private int countTotalVotes(String candidate) {
		return firstChoice.get(candidate) * 3 + secondChoice.get(candidate) * 2 + thirdChoice.get(candidate);
	}
}