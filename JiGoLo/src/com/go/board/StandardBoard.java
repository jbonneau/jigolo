/**
 * Créée le 25 sept. 2008
 */
package com.go.board;

import java.util.HashMap;
import java.util.Map;

import com.go.board.boardData.BoardData;
import com.go.game.move.Move;

/**
 * @author LhaaG
 *
 */
public class StandardBoard implements GenericBoard {

	private int hSize;
	private int vSize;
	private Map<Integer, BoardData> gobanMap;
	
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
		this.gobanMap = new HashMap<Integer, BoardData>();
		this.gobanMap.put(0, new BoardData(this.hSize, this.vSize));
	}

	public void playMoveAt(Move move) {
		BoardData newBoard = new BoardData(move, this.getGobanAt(move.getNumber()).getIntersectionArray());
		this.gobanMap.put(move.getNumber(), newBoard);
	}

	public BoardData getGobanAt(int move) {
		return this.gobanMap.get(move);
	}

}// class StandardBoard