package fuchimi;


public class Scissors extends Hand {
	Paper paper;

	@Override
	public String toString() {
		return "Scissors";
	}

	@Override
	public boolean beats(Hand hand) {
		return hand.looseAgainst(this);
	}

	@Override
	public boolean looseAgainst(Rock rock) {
			return true;
	}

	@Override
	public boolean looseAgainst(Paper paper) {
			return false;
	}

	@Override
	public boolean looseAgainst(Scissors scissors) {
			return false;
	}

}
