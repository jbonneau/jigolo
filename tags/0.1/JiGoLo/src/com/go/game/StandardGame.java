/**
 * Créée le 25 sept. 2008
 */
package com.go.game;

import javax.swing.tree.DefaultMutableTreeNode;

import com.go.board.StandardBoard;
import com.go.game.move.Move;
import com.go.player.GenericPlayer;
import com.go.player.StandardPlayer;
import com.go.rules.GenericRules;
import com.go.rules.StandardRules;

/**
 * @author LhaaG
 *
 */
public class StandardGame implements GenericGame {

	// goban et règles
	private StandardBoard goban;
	private GenericRules rules;

	// joueurs
	private GenericPlayer playerBlack;
	private GenericPlayer playerWhite;

	// coups de la partie
	private DefaultMutableTreeNode movesTree;
	private int currentMoveNumber;
	private int currentVariation;

	/**
	 * Constructeur vide
	 */
	public StandardGame() {
		this.goban = new StandardBoard();
		this.rules = new StandardRules(GenericRules.KOMI_JAPAN, GenericRules.BLACK);
		this.playerBlack = new StandardPlayer();
		this.playerWhite = new StandardPlayer();
		this.init();
	}

	/**
	 * Constructeur par défaut
	 */
	public StandardGame(GenericPlayer black, GenericPlayer white, int hSize, int vSize, double komi, String startColor) {
		this.goban = new StandardBoard(hSize, vSize);
		this.rules = new StandardRules(komi, startColor);
		this.playerBlack = black;
		this.playerWhite = white;
		this.init();
	}

	private void init() {
		this.currentVariation = 0;
		this.currentMoveNumber = 0;
	}

	public boolean playAt(StandardPlayer player, int hCoord, int vCoord) {
		if (this.isEmpty(hCoord, vCoord)) {
			Move movePlayed = new Move(this.currentVariation, this.currentMoveNumber, player.getColor(), hCoord, vCoord);
			this.goban.playMove(movePlayed);
			this.addMove(movePlayed);
			this.currentMoveNumber++;
			return true;
		}
		else return false;
	}

	private void addMove(Move move) {
		if (this.movesTree == null) this.movesTree = new DefaultMutableTreeNode(move);
		else {
			DefaultMutableTreeNode child = new DefaultMutableTreeNode(move);
			this.movesTree.add(child);
		}
	}

	private boolean isEmpty(int hCoord, int vCoord) {
		return this.goban.getIntersectionAt(hCoord, vCoord).isEmpty();
	}

}// class StandardGame