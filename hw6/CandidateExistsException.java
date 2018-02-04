
public class CandidateExistsException extends Exception {
	String candidate;

	public CandidateExistsException(String candidate) {
		this.candidate = candidate;
	}
}
