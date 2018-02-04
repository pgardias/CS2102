
public class UnknownCandidateException extends Exception {
	// name of the candidate that was voted for multiple times or not on the
	// ballot, respectively. If multiple names were not on the ballot, report
	// the first one (in order of the arguments to processVote())
	String candidate;

	public UnknownCandidateException(String candidate) {
		this.candidate = candidate;
	}
}
