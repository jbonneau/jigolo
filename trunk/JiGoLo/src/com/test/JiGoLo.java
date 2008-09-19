/**
 * Créée le 11 août 08
 */
package com.test;

import com.gui.account.AccountView;
import com.gui.account.manager.AccountModel;
import com.rpg.account.AccountManager;
import com.util.sql.SQLManager;

/**
 * @author LhaaG
 *
 */
public class JiGoLo {

	/**
	 * Test console de la partie RolePlay
	 * @param args
	 */
	public static void main(String[] args) {

		/* ************** */
		/* Début du test */
		/* ************ */

		/* Lancement de la base de données */
		SQLManager.init();
		/* Création des tables */
		SQLManager.createTables();

		/* Gestion des comptes */
		AccountManager accountManager = new AccountManager();
		AccountModel accountModel = new AccountModel(accountManager);
		AccountView accountView = new AccountView(accountModel);

		accountView.setVisible(true);
		
	}// main


}// class JiGoLo