/**
 * Créée le 19 août 08
 */
package com.rpg.stat;

/**
 * @author LhaaG
 *
 */
public class PlayerStat {

	private long id;
	private long playerId;
	private int gamesWon;
	private int gamesLost;
	private int gamesTied;

	/**
	 * @param playerId
	 */
	public PlayerStat(long playerId) {
		this.playerId = playerId;
		this.gamesWon = 0;
		this.gamesLost = 0;
		this.gamesTied = 0;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	private void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the gamesPlayedWon
	 */
	public int getGamesPlayedWon() {
		return gamesWon;
	}

	/**
	 * @param gamesPlayedWon the gamesPlayedWon to set
	 */
	public void setGamesPlayedWon(int gamesPlayedWon) {
		this.gamesWon = gamesPlayedWon;
	}

	/**
	 * @return the gamesPlayedLost
	 */
	public int getGamesPlayedLost() {
		return gamesLost;
	}

	/**
	 * @param gamesPlayedLost the gamesPlayedLost to set
	 */
	public void setGamesPlayedLost(int gamesPlayedLost) {
		this.gamesLost = gamesPlayedLost;
	}

	/**
	 * @return the gamesPlayedTied
	 */
	public int getGamesPlayedTied() {
		return gamesTied;
	}

	/**
	 * @param gamesPlayedTied the gamesPlayedTied to set
	 */
	public void setGamesPlayedTied(int gamesPlayedTied) {
		this.gamesTied = gamesPlayedTied;
	}

}// class PlayerStat