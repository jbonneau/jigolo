/**
 * Créée le 25 sept. 2008
 */
package com.go.rules;

/**
 * @author LhaaG
 *
 */
public class StandardRules implements GenericRules {

	private double komi;
	private String firstPlayer;

	/**
	 * @param komi
	 * @param firstPlayer
	 */
	public StandardRules(double komi, String firstPlayer) {
		this.komi = komi;
		this.firstPlayer = firstPlayer;
	}
	
	

}// class StandardRules