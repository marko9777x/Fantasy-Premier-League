package logic;

import java.util.ArrayList;

public class Team {
	
	private String name;
	private ArrayList<Player> players;
	
	public Team() {
		this.players = new ArrayList<Player>();
	}
	
    public String getName() {
    	return this.name;
    }
    
    public ArrayList<Player> getPlayers() {
    	return this.players;
    }
    
    public void setName(String setName) {
    	this.name = setName;
    }

}
