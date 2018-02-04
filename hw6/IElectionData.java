
public interface IElectionData {
	public void addCandidate(String candidate) throws CandidateExistsException;

	public void processVote(String firstVoteCandidate, String secondVoteCandidate, String thirdVoteCandidate) throws UnknownCandidateException, DuplicateVotesException;
}
