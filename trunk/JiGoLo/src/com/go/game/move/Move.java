/**
 * Créée le 26 sept. 2008
 */
package com.go.game.move;

import com.go.rules.color.Color;

/**
 * @author LhaaG
 *
 */
public class Move {

	private int number;
	private int horizontalCoord;
	private int verticalCoord;
	private boolean passMove;
	private Color color;

	/**
	 * Un coup dans une partie défini par son numéro, sa couleur et sa position sur le goban
	 * @param number
	 * @param color
	 * @param horizontalCoord
	 * @param verticalCoord
	 */
	public Move(int number, Color color, int horizontalCoord, int verticalCoord) {
		this.number = number;
		this.color = color;
		this.horizontalCoord = horizontalCoord;
		this.verticalCoord = verticalCoord;
		this.passMove = false;
	}
	
	/**
	 * Un coup qui "passe"
	 * @param number
	 * @param color
	 */
	public Move(int number, Color color) {
		this.number = number;
		this.color = color;
		this.horizontalCoord = 0;
		this.verticalCoord = 0;
		this.passMove = true;
	}

	/**
	 * @return the horizontalCoord
	 */
	public int getHorizontalCoord() {
		return horizontalCoord;
	}

	/**
	 * @return the verticalCoord
	 */
	public int getVerticalCoord() {
		return verticalCoord;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

}// class Move