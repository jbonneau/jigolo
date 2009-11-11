/**
 * Créée le 25 sept. 2008
 */
package com.go.board;

import com.go.board.intersection.StandardIntersection;
import com.go.game.move.Move;
import com.go.rules.color.Color;

/**
 * @author LhaaG
 *
 */
public class StandardBoard implements GenericBoard {

	private int hSize;
	private int vSize;
	private StandardIntersection[][] currentGoban;
	
	/**
	 * Constructeur par défaut en 19*19
	 */
	public StandardBoard() {
		this.hSize = GOBAN_19;
		this.vSize = GOBAN_19;
		this.init();
	}

	/**
	 * @param hSize
	 * @param vSize
	 */
	public StandardBoard(int hSize, int vSize) {
		this.hSize = hSize;
		this.vSize = vSize;
		this.init();
	}

	private void init() {
		this.currentGoban = new StandardIntersection[this.hSize][this.vSize];
		for (int i=0; i<this.hSize; i++) {
			for (int j=0; j<this.vSize; j++) {
				StandardIntersection emptyCase = new StandardIntersection(Color.getEMPTY(), i, j);
				this.currentGoban[i][j] = emptyCase;
			}
		}
	}

	public void playMove(Move move) {
		if (!move.isPassMove())
			this.currentGoban[move.getHorizontalCoord()][move.getVerticalCoord()].setColor(move.getColor());
	}

	public StandardIntersection getIntersectionAt(int hCoord, int vCoord) {
		return this.currentGoban[hCoord][vCoord];
	}

}// class StandardBoard