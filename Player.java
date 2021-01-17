
public class Player {

	protected String name;
	private boolean defence;
	protected DefenceBehavior defenceB;
	protected OffenceBehavior offenceB;
	
	/**
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
		this.setDefenceBehavior();
		this.setOffenceBehavior();
		this.defence = false;
	}
	/**
	 * @param setting the defence behavior
	 */
	public void setDefenceBehavior() {
		this.defenceB = null;
	}
	/**
	 * @param setting the offence behavior
	 */
	public void setOffenceBehavior() {
		this.offenceB = null;
	}
	
	public String play() {
		if(this.defence) { 
			if(this.defenceB == null) 
			return "not playing";
		else
			return this.offenceB.play();
	} 
	else {
		if(this.offenceB == null)
			return "not playing";
		else
			return this.offenceB.play();
	}
	}
	public void turnover() {
		this.defence = true;
	}
}