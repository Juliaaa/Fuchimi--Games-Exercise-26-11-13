package fuchimi;


public class Scissors extends Hand {

	@Override
	public boolean beats(Hand hand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loseAgainst(Rock rock) {
		while (true) {
			return true;
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
			return false;
		}
	}

}
