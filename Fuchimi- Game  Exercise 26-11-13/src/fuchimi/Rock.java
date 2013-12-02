package fuchimi;


public class Rock extends Hand {

	@Override
	public String toString() {
		return "Rock";
	}
	
	@Override
	public boolean beats(Hand hand) {
		return hand.looseAgainst(this);
	}

	@Override
	public boolean looseAgainst(Rock rock) {
		while (true) {
			return false;
		}
	}

	@Override
	public boolean looseAgainst(Paper paper) {
		while (true) {
			return true;
		}
	}

	@Override
	public boolean looseAgainst(Scissors scissors) {
		while (true) {
			return false;
		}
	}	
	

}
