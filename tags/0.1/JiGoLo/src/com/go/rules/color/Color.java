/**
 * Créée le 26 sept. 2008
 */
package com.go.rules.color;

/**
 * @author LhaaG
 *
 */
public class Color {

	private static final Color EMPTY = new Color(0);
	private static final Color BLACK = new Color(1);
	private static final Color WHITE = new Color(2);
	private static final Color EDGE = new Color(3);

	private int nature;

	/**
	 * @param nature
	 */
	public Color(int nature) {
		this.nature = nature;
	}

	public boolean isEmpty() {
		return (this.nature == EMPTY.nature);
	}

	public boolean isBlack() {
		return (this.nature == BLACK.nature);
	}

	public boolean isWhite() {
		return (this.nature == WHITE.nature);
	}

	public boolean isEdge() {
		return (this.nature == EDGE.nature);
	}

	/**
	 * @return the EMPTY status
	 */
	public static Color getEMPTY() {
		return EMPTY;
	}

	/**
	 * @return the BLACK color
	 */
	public static Color getBLACK() {
		return BLACK;
	}

	/**
	 * @return the WHITE color
	 */
	public static Color getWHITE() {
		return WHITE;
	}

	/**
	 * @return the EDGE of the board
	 */
	public static Color getEDGE() {
		return EDGE;
	}

}// class Color