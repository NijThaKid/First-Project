
public class Receiver extends Player {
	
	public Receiver(String name) {
		super(name);
		this.setDefenceBehavior();
		this.setOffenceBehavior();
	}
	
	/**
	 * @param setting the defence behavior
	 */

	public void setDefenceBehavior(DefenceBehavior defenceBehavior) {
		this.defenceB = null;
	}
	
	public String toString() {
		return this.name + "" +this.play();
	}
}
