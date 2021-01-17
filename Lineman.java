
public class Lineman extends Player {

	public Lineman(String name) {
		super(name);
		this.setDefenceBehavior();
		this.setOffenceBehavior();
	}
	
	/**
	 * @param setting the defence behavior
	 */
	
	public void setDefenceBehavior() {
		int choice = (int)Math.random()*3;
		if(choice == 0)
			defenceB = new BlockBehavior();
		else if(choice == 1)
			defenceB = new StripBehavior();
		else
			defenceB = new SackBehavior();
	}
	
	/**
	 * @param setting the offence behavior
	 */
	public void setOffenceBehavior() {
		this.offenceB = new OBlockBehavior();
	}
	
	public String toString() {
		return this.name + "" + this.play();
	}
}
