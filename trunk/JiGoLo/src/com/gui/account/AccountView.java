/*
 * Created by JFormDesigner on Tue Sep 02 15:27:10 CEST 2008
 */

package com.gui.account;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

import com.gui.account.manager.AccountModel;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import com.util.ihm.IHMUtil;

/**
 * @author LhaaG
 */
@SuppressWarnings("serial")
public class AccountView extends JFrame {

	private final AccountModel model;

	public AccountView(AccountModel model) {
		this.model = model;
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");
		accountPane = new JPanel();
		accountForm = new JPanel();
		accountScroll = new JScrollPane();
		accountTable = new JTable();
		accountButtons = new JPanel();
		accountNew = new JButton();
		accountEdit = new JButton();
		accountDel = new JButton();
		accountOk = new JButton();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setTitle(bundle.getString("Account.this.title"));
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== accountPane ========
		{
			accountPane.setBorder(Borders.DLU4_BORDER);
			accountPane.setLayout(new BorderLayout());

			//======== accountForm ========
			{
				accountForm.setLayout(new FormLayout(
					"default:grow",
					"default:grow"));

				//======== accountScroll ========
				{
					//---- accountTable ----
					accountTable.setModel(IHMUtil.createAccountTableModel(this.model.getAccountSelection()));
					{
						TableColumnModel cm = accountTable.getColumnModel();
						cm.getColumn(0).setMinWidth(50);
						cm.getColumn(1).setMinWidth(50);
					}
					accountScroll.setViewportView(accountTable);
				}
				accountForm.add(accountScroll, cc.xy(1, 1));
			}
			accountPane.add(accountForm, BorderLayout.CENTER);

			//======== accountButtons ========
			{
				accountButtons.setBorder(Borders.BUTTON_BAR_GAP_BORDER);
				accountButtons.setLayout(new FormLayout(
					"2*([40dlu,default], $lcgap), [40dlu,default], $glue, $button",
					"pref"));

				//---- accountNew ----
				accountNew.setMnemonic(bundle.getString("Account.accountNew.mnemonic").charAt(0));
				accountNew.setAction(this.model.getNewAction());
				accountButtons.add(accountNew, cc.xy(1, 1));

				//---- accountEdit ----
				accountEdit.setMnemonic(bundle.getString("Account.accountEdit.mnemonic").charAt(0));
				accountEdit.setAction(this.model.getEditAction());
				accountButtons.add(accountEdit, cc.xy(3, 1));

				//---- accountDel ----
				accountDel.setMnemonic(bundle.getString("Account.accountDel.mnemonic").charAt(0));
				accountDel.setAction(this.model.getDeleteAction());
				accountButtons.add(accountDel, cc.xy(5, 1));

				//---- accountOk ----
				accountOk.setText("OK");
				accountButtons.add(accountOk, cc.xy(7, 1));
			}
			accountPane.add(accountButtons, BorderLayout.SOUTH);
		}
		contentPane.add(accountPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel accountPane;
	private JPanel accountForm;
	private JScrollPane accountScroll;
	private JTable accountTable;
	private JPanel accountButtons;
	private JButton accountNew;
	private JButton accountEdit;
	private JButton accountDel;
	private JButton accountOk;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}// class AccountChoice