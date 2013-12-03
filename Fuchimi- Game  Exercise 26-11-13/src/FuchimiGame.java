import fuchimi.Hand;
import fuchimi.Paper;
import fuchimi.Rock;
import fuchimi.Scissors;

public class FuchimiGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Fuchimi");
	}

	public static Hand select (int chose) {
		Hand hand;
		int number = 3;
		switch (number) {
		case 1: hand = new Rock();
		case 2: hand = new Paper();
		case 3: hand = new Scissors();
		default: hand = null;
		}
		return hand;
	}

}
