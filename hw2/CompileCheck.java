import java.util.LinkedList;
public class CompileCheck {

	public static void main(String[] args) {
		MassStartResult dummyRun = new MassStartResult(55.2, 2);

		LinkedList<JumpingRound> rounds = new LinkedList<>();
		JumpingRound b1 = new JumpingRound(0, 91.4);
		JumpingRound b2 = new JumpingRound(4.5, 83.1);
		JumpingRound b3 = new JumpingRound(5.7, 79.2);
		JumpingRound b4 = new JumpingRound(2, 86.3);
		JumpingRound b5 = new JumpingRound(5, 77.6);

		rounds.add(b1);
		rounds.add(b2);
		rounds.add(b3);
		rounds.add(b4);
		rounds.add(b5);

		LinkedList<JumpingRound> rounds2 = new LinkedList<>();
		JumpingRound b6 = new JumpingRound(0, 91.4);
		JumpingRound b7 = new JumpingRound(4.5, 83.1);
		JumpingRound b8 = new JumpingRound(5.7, 79.2);
		JumpingRound b9 = new JumpingRound(2, 86.3);

		rounds2.add(b6);
		rounds2.add(b7);
		rounds2.add(b8);
		rounds2.add(b9);

		JumpingResult result1 = new JumpingResult(rounds);
		JumpingResult result2 = new JumpingResult(rounds2);

		SkiingResult dummySkiResult = new SkiingResult(105.0, 6);

		Athlete a1 = new Athlete("Athlete1", result1, dummySkiResult);
		Athlete a2 = new Athlete("Athlete2", result2, dummySkiResult);

		LinkedList<Athlete> athletes = new LinkedList<>();
		athletes.add(a1);
		athletes.add(a2);

		Competition comp = new Competition(athletes, 5);

		LinkedList<String> test1 = comp.jumpingDNF();
		boolean test2 = comp.anyJumpingImprovement(comp);
		double test3 = result1.pointsEarned();
		JumpingRound test4 = result1.bestRound();
		double test5 = comp.skiingScoreForAthlete("Athlete1");
		
        System.out.println("Congrats! Your program compiled and ran!");
	}
}

