package fuchimi;


public class Paper extends Hand {

	@Override
	public boolean beats(Hand hand) {
	return false;
	}

	@Override
	public boolean loseAgainst(Rock rock) {
		while (true) {
			return false;
		}
	}

	@Override
	public boolean loseAgainst(Paper paper) {
		while (true) {
			return false;
		}
	}

	@Override
	public boolean loseAgainst(Scissors scissors) {
		while (true) {
			return true;
		}
	}
	

}
