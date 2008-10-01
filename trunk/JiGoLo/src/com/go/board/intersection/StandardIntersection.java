/**
 * Créée le 25 sept. 2008
 */
package com.go.board.intersection;

import java.util.ArrayList;
import java.util.List;

import com.go.rules.color.Color;

/**
 * @author LhaaG
 *
 */
public class StandardIntersection implements GenericIntersection {

	private Color color;
	private int horizontalCoord;
	private int verticalCoord;
	private List<Color> liberties;

	/**
	 * @param number
	 * @param color
	 */
	public StandardIntersection(Color color, int hCoord, int vCoord) {
		this.color = color;
		this.horizontalCoord = hCoord;
		this.verticalCoord = vCoord;
		this.liberties = new ArrayList<Color>();
		for (int i=0; i<STANDARD_NUMBER_LIBERTIES; i++) {
			if (i==0 && this.horizontalCoord == STANDARD_EDGE_VCOORD_BEGIN) {
				this.liberties.add(Color.getEDGE());
			}
			if (i==1 && this.horizontalCoord == STANDARD_EDGE_VCOORD_BEGIN) {
				this.liberties.add(Color.getEDGE());
			}
			if (i==2 && this.horizontalCoord == STANDARD_EDGE_VCOORD_BEGIN) {
				this.liberties.add(Color.getEDGE());
			}
			else if (i==4 && this.horizontalCoord == STANDARD_EDGE_HCOORD_BEGIN) {
				this.liberties.add(Color.getEDGE());
			}
			else this.liberties.add(Color.getEMPTY());
		}
	}

	public boolean isEmpty() {
		return this.color.isEmpty();
	}

	public boolean isBlack() {
		return this.color.isBlack();
	}

	public boolean isWhite() {
		return this.color.isWhite();
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}// class StandardIntersection