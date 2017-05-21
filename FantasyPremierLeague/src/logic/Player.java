package logic;

public class Player {
	
	private String name;
	private int numGoals;
	private int position;
	public static final int POSITION_OFFENSE = 1;
	public static final int POSITION_MIDDLE = 1;
	
	public String getName() {
		return this.name;
	}
	
	public int getNumGoals() {
		return this.numGoals;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public void setName(String setName) {
		this.name = setName;
	}
	
	public void setNumGoals(int setNumGoals) {
		this.numGoals = setNumGoals;
	}
	
	public void setPosition(int setPosition) {
		this.position = setPosition;
	}
	

}
