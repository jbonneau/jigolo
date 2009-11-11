/**
 * Créée le 16 septembre 2008
 */
package com.gui.account.manager;

import com.jgoodies.binding.PresentationModel;
import com.jgoodies.binding.value.ValueHolder;
import com.rpg.account.Account;

/**
 * @author LhaaG
 *
 */
@SuppressWarnings("serial")
public class AccountPresentationModel extends PresentationModel<Account> {

	public AccountPresentationModel(Account account) {
		super(new ValueHolder(account, true));
	}


}// class AccountPresentationModel