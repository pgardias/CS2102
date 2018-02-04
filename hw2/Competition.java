import java.util.LinkedList;

public class Competition {
	LinkedList<Athlete> listOfAthletes = new LinkedList<Athlete>();
	int jumpingRoundsUsed; // integer indicating the (non-negative) number of
							// JumpingRounds to be used in this competition

	// Constructor for Competition
	public Competition(LinkedList<Athlete> listOfAthletes, int jumpingRoundsUsed) {
		this.listOfAthletes = listOfAthletes;
		this.jumpingRoundsUsed = jumpingRoundsUsed;
	}

	// jumpingDNF: produces a LinkedList of the names of the Athletes in the
	// competition whose list of JumpingRounds is less than the number of rounds
	public LinkedList<Athlete> jumpingDNF() {
		LinkedList<Athlete> listOfAthletesDNF = new LinkedList<Athlete>();
		for (Athlete a : this.listOfAthletes) {
			if (a.JR.jumpingResult.size() < jumpingRoundsUsed) {
				listOfAthletesDNF.add(a);
			}
		}
		return listOfAthletesDNF;
	}

	// skiingScoreForAthlete: returns the score that the athlete earned in the
	// cross-country race
	public Athlete skiingScoreForAthlete(String name) {
		for (Athlete a : this.listOfAthletes) {
			if (a.name.equals(name)) {
				return a;
			}
		}
		return null; // should never reach this point as it is assumed there is
						// an athlete with the name in the list
	}

	// anyJumpingImprovement: which takes another Competition as input and
	// returns true if any of the athletes in "this" competition had a better
	// jumping score than they had in the given competition
	public boolean anyJumpingImprovement(Competition c) {
		for (Athlete a : this.listOfAthletes) {
			for (Athlete b : c.listOfAthletes) {
				if (b.equals(a)) {
					if (b.JR.pointsEarned() > a.JR.pointsEarned()) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
