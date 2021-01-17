
public class PassBehavior implements OffenceBehavior{
	
	public String play() {
		String [] moves = {"slant", "out route", "seam route", "screen pass", "hail mary" };
		int choice = (int) Math.random() * 5;
		return "throws a " + moves[choice];
	}

}
