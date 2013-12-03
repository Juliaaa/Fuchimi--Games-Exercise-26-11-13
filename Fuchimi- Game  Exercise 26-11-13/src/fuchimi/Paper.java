package fuchimi;


public class Paper extends Hand {

	@Override
	public String toString() {
		return "Paper";
	}

	@Override
	public boolean beats(Hand hand) {
		return hand.looseAgainst(this);
	}

	@Override
	public boolean looseAgainst(Rock rock) {
			return false;
	}

	@Override
	public boolean looseAgainst(Paper paper) {
			return false;
	}

	@Override
	public boolean looseAgainst(Scissors scissors) {
			return true;
	}


}
