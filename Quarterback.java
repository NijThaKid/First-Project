
public class Quarterback extends Player {

	public Quarterback(String name) {
		super(name);
		this.setDefenceBehavior();
		this.setOffenceBehavior();
	}
	
	/**
	 * @param setting the defence behavior
	 */
	public void setDefenceBehavior() {
		defenceB = null;
	}
	
	/**
	 * @param setting the offence behavior
	 */
	public void setOffenceBehavior() {
		int choice = (int)Math.random()*2;
		if(choice == 0)
			offenceB = new PassBehavior();
		else
			offenceB = new PassBehavior();
	}
}

