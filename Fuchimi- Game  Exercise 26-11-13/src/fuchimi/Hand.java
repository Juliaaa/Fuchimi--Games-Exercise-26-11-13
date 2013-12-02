package fuchimi;


public abstract class Hand { //in an interface is protected not allowed
	public abstract boolean beats(Hand hand);
	protected abstract boolean looseAgainst(Rock rock); 
	protected abstract boolean looseAgainst(Paper paper); 
	protected abstract boolean looseAgainst(Scissors scissors); 
}
