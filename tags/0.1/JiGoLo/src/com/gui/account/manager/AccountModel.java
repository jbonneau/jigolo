/**
 * Créée le 10 septembre 2008
 */
package com.gui.account.manager;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.Action;

import com.gui.account.AccountEditorDialog;
import com.jgoodies.binding.list.SelectionInList;
import com.rpg.account.Account;
import com.rpg.account.AccountManager;


/**
 * @author LhaaG
 *
 */
public final class AccountModel {

	private final AccountManager accountManager;
	private SelectionInList<Account> accountSelection;

	private Action newAction;
	private Action editAction;
	private Action deleteAction;


	/**
	 * @param accountManager
	 */
	public AccountModel(AccountManager accountManager) {
		this.accountManager = accountManager;
		this.initModels();
		this.initEventHandling();
	}

	private void initModels() {
		this.accountSelection = new SelectionInList<Account>(accountManager.getManagedAccounts());
		this.newAction = new NewAction();
		this.editAction = new EditAction();
		this.deleteAction = new DeleteAction();
		this.updateActionEnablement();
	}

	private void initEventHandling() {
		this.accountSelection.addPropertyChangeListener(SelectionInList.PROPERTYNAME_SELECTION_EMPTY, new SelectionEmptyHandler());
	}

	/**
	 * @return the accountSelection
	 */
	public SelectionInList<Account> getAccountSelection() {
		return accountSelection;
	}

	/**
	 * @return the newAction
	 */
	public Action getNewAction() {
		return newAction;
	}

	/**
	 * @return the editAction
	 */
	public Action getEditAction() {
		return editAction;
	}

	/**
	 * @return the deleteAction
	 */
	public Action getDeleteAction() {
		return deleteAction;
	}

	private void doNew(ActionEvent e) {
		Account newAccount = this.accountManager.createItem();
		boolean canceled = this.openAccountEditor(newAccount);
		if (!canceled) {
			newAccount.setInitDate(new Date());
			this.addItem(newAccount);
		}
		this.getAccountSelection().setSelection(newAccount);
	}

	private void doEdit(ActionEvent e) {
		boolean canceled = this.openAccountEditor(this.getSelectedItem());
		if (!canceled) {
			this.editItem(this.getSelectedItem());
			this.getAccountSelection().fireSelectedContentsChanged();
		}
	}

	private void doDelete(ActionEvent e) {
		this.accountManager.removeAccount(getSelectedItem());
	}

	private void addItem(Account accountToAdd) {
		this.accountManager.addAccount(accountToAdd);
	}

	private void editItem(Account accountToEdit) {
		this.accountManager.editAccount(accountToEdit);
	}

	private boolean openAccountEditor(Account account) {
		AccountEditorDialog dialog = new AccountEditorDialog(null, account);
		dialog.open();
		return dialog.hasBeenCanceled();
	}

	private Account getSelectedItem() {
		return getAccountSelection().getSelection();
	}

	// Actions ****************************************************************

	@SuppressWarnings("serial")
	private class NewAction extends AbstractAction {
		private NewAction() {
			// JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
			ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");

			putValue(NAME, bundle.getString("Account.actionNew.Name"));
			putValue(SHORT_DESCRIPTION, bundle.getString("Account.actionNew.ShortDescription"));
			// JFormDesigner - End of action initialization  //GEN-END:initComponents
		}

		public void actionPerformed(ActionEvent e) {
			doNew(e);
		}
	}

	@SuppressWarnings("serial")
	private class EditAction extends AbstractAction {
		private EditAction() {
			// JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
			ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");

			putValue(NAME, bundle.getString("Account.actionEdit.Name"));
			putValue(SHORT_DESCRIPTION, bundle.getString("Account.actionEdit.ShortDescription"));
			// JFormDesigner - End of action initialization  //GEN-END:initComponents
		}

		public void actionPerformed(ActionEvent e) {
			doEdit(e);
		}
	}

	@SuppressWarnings("serial")
	private class DeleteAction extends AbstractAction {
		private DeleteAction() {
			// JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
			ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");

			putValue(NAME, bundle.getString("Account.actionDelete.Name"));
			putValue(SHORT_DESCRIPTION, bundle.getString("Account.actionDelete.ShortDescription"));
			// JFormDesigner - End of action initialization  //GEN-END:initComponents
		}

		public void actionPerformed(ActionEvent e) {
			doDelete(e);
		}
	}

	private void updateActionEnablement() {
		boolean hasSelection = getAccountSelection().hasSelection();
		this.getEditAction().setEnabled(hasSelection);
		this.getDeleteAction().setEnabled(hasSelection);
	}

	private final class SelectionEmptyHandler implements PropertyChangeListener {
		public void propertyChange(PropertyChangeEvent evt) {
			updateActionEnablement();
		}
	}

}// class AccountChoiceModel