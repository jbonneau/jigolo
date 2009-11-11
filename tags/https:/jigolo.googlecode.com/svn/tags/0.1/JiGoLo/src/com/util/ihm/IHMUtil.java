/**
 * Créée le 12 septembre 2008
 */
package com.util.ihm;

import javax.swing.ListModel;
import javax.swing.table.TableModel;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.rpg.account.Account;

/**
 * @author LhaaG
 *
 */
public class IHMUtil {


	public static TableModel createAccountTableModel(ListModel listModel) {
		return new AccountTableModel(listModel);
	}


	// TableModel *************************************************************

	/**
	 * Describes how to present an Account in a JTable.
	 */
	@SuppressWarnings("serial")
	private static final class AccountTableModel extends AbstractTableAdapter<Account> {

		private static final String[] COLUMNS =
			{"Pseudo", "Date de cr\u00e9ation", "Description", "nb"};

		private AccountTableModel(ListModel listModel) {
			super(listModel, COLUMNS);
		}

		public Object getValueAt(int rowIndex, int columnIndex) {
			Account account = getRow(rowIndex);
			switch (columnIndex) {
				case 0 : return account.getPseudo();
				case 1 : return account.getInitDate();
				case 2 : return account.getDescription();
				case 3 : return 0;
				default :
					throw new IllegalStateException("Unknown column");
			}
		}
	}

}// class IHMUtil