
public class BlockBehavior implements DefenceBehavior{
	
	public String play() {
		String [] moves = {"kick", "punt", "pass", "catch"};
		int choice = (int) Math.random() * 4;
		return "block a " + moves[choice];
	}

}
