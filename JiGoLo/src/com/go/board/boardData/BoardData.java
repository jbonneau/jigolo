/**
 * Créée le 25 sept. 2008
 */
package com.go.board.boardData;

import com.go.board.intersection.StandardIntersection;
import com.go.game.move.Move;

/**
 * @author LhaaG
 *
 */
public class BoardData {

	private Move turnMove;
	private StandardIntersection[][] turnGoban;

	/**
	 * Constructeur initial
	 * @param hSize
	 * @param vSize
	 */
	public BoardData(int hSize, int vSize) {
		this.turnGoban = new StandardIntersection[hSize][vSize];
	}

	/**
	 * Constructeur non utilisé
	 * @param intersectionArray
	 */
	public BoardData(StandardIntersection[][] intersectionArray) {
		this.turnGoban = intersectionArray;
	}

	/**
	 * Constructeur itératif
	 * @param intersectionArray
	 */
	public BoardData(Move move, StandardIntersection[][] intersectionArray) {
		this.turnMove = move;
		this.turnGoban = intersectionArray;
		this.currentPlayAt(move);
	}

	public boolean isAtari() {
		// TODO isAtari
		return false;
	}

	public StandardIntersection getIntersectionAt(int hCoord, int vCoord) {
		return this.turnGoban[hCoord][vCoord];
	}

	private void currentPlayAt(Move move) {
		this.turnGoban[move.getHorizontalCoord()][move.getVerticalCoord()].setColor(move.getColor());
	}

	/**
	 * @return the intersectionArray
	 */
	public StandardIntersection[][] getIntersectionArray() {
		return turnGoban;
	}

}// class BoardData