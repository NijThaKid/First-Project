
public class ReceiverBehavior implements OffenceBehavior{
	
	public String play() {
		String [] moves = {"slant route", "out route", "seam route", "screen pass", "hail mary"};
		int choice = (int) Math.random() * 5;
		return "runs a " + moves[choice];
		}
	}
