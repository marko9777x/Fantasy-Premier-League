package logic;

import java.util.ArrayList;

public class TeamRequirements {

	private int numOffensePlayer;
	private int numMiddlePlayer;
	
	public int getNumOffensePlayer() {
		return this.numOffensePlayer;
	}
	
	public int getNumMiddlePlayer() {
		return this.numMiddlePlayer;
	}
	
	public void setNumOffensePlayer(int setNumOffensePlayer) {
		this.numOffensePlayer = setNumOffensePlayer;
	}
	
	public void setNumMiddlePlayer(int setNumMiddlePlayer) {
		this.numMiddlePlayer = setNumMiddlePlayer;
	}
	
	public float check(Team team) {
		ArrayList<Player> players = team.getPlayers();
		int numFoundOffense = 0;
		int numFoundMiddle = 0;
		for (Player player : players) {
			if (player.getPosition() == Player.POSITION_OFFENSE && numFoundOffense < this.numOffensePlayer) {
				numFoundOffense++;
			}
			if (player.getPosition() == Player.POSITION_MIDDLE && numFoundMiddle < this.numMiddlePlayer) {
				numFoundMiddle++;
			}	
		}
		float point = 1f / (this.numOffensePlayer + this.numMiddlePlayer);
		return (point * numFoundOffense + point * numFoundMiddle);
	}
	
}
