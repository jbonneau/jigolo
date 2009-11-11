/*
 * Created by JFormDesigner on Wed Sep 10 18:10:53 CEST 2008
 */

package com.gui.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;

import com.gui.account.manager.AccountPresentationModel;
import com.jgoodies.binding.adapter.BasicComponentFactory;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import com.rpg.account.Account;

/**
 * @author LhaaG
 */
@SuppressWarnings("serial")
public class AccountEditorDialog extends JDialog {

	private final AccountPresentationModel accountPresentationModel;
	private boolean canceled;

	public AccountEditorDialog(Frame owner, Account account) {
		super(owner, true);
		this.accountPresentationModel = new AccountPresentationModel(account);
		initComponents();
		this.canceled = false;
	}

	public void open() {
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}

	public void close() {
		this.release();
		this.dispose();
	}

	public boolean hasBeenCanceled() {
		return this.canceled;
	}

	private void release() {
		this.accountPresentationModel.setBean(null);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");
		DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
		editorPane = new JPanel();
		editorContent = new JPanel();
		separator1 = compFactory.createSeparator(bundle.getString("AccountEditorDialog.separator1.text"));
		label1 = new JLabel();
		textField1 = BasicComponentFactory.createTextField(this.accountPresentationModel.getBufferedModel("pseudo"));
		label2 = new JLabel();
		textField2 = BasicComponentFactory.createTextField(this.accountPresentationModel.getBufferedModel("password"));
		separator2 = compFactory.createSeparator(bundle.getString("AccountEditorDialog.separator2.text"));
		label3 = new JLabel();
		textField3 = BasicComponentFactory.createTextField(this.accountPresentationModel.getBufferedModel("description"));
		label4 = new JLabel();
		textField4 = BasicComponentFactory.createTextField(this.accountPresentationModel.getBufferedModel("initDate"));
		label5 = new JLabel();
		textField5 = new JTextField();
		editorButtons = new JPanel();
		editorOk = new JButton();
		editorCancel = new JButton();
		actionOk = new EditorOk();
		actionCancel = new EditorCancel();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setTitle(bundle.getString("AccountEditorDialog.this.title"));
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== editorPane ========
		{
			editorPane.setBorder(Borders.DIALOG_BORDER);
			editorPane.setLayout(new BorderLayout());

			//======== editorContent ========
			{
				editorContent.setBorder(Borders.DLU4_BORDER);
				editorContent.setLayout(new FormLayout(
					"right:[50dlu,default], $lcgap, [100dlu,default]",
					"6*(default, $lgap), default"));
				editorContent.add(separator1, cc.xywh(1, 1, 3, 1));

				//---- label1 ----
				label1.setText(bundle.getString("AccountEditorDialog.label1.text"));
				editorContent.add(label1, cc.xy(1, 3));
				editorContent.add(textField1, cc.xy(3, 3));

				//---- label2 ----
				label2.setText(bundle.getString("AccountEditorDialog.label2.text"));
				editorContent.add(label2, cc.xy(1, 5));
				editorContent.add(textField2, cc.xy(3, 5));
				editorContent.add(separator2, cc.xywh(1, 7, 3, 1));

				//---- label3 ----
				label3.setText(bundle.getString("AccountEditorDialog.label3.text"));
				editorContent.add(label3, cc.xy(1, 9));
				editorContent.add(textField3, cc.xy(3, 9));

				//---- label4 ----
				label4.setText(bundle.getString("AccountEditorDialog.label4.text"));
				editorContent.add(label4, cc.xy(1, 11));

				//---- textField4 ----
				textField4.setEditable(false);
				editorContent.add(textField4, cc.xy(3, 11));

				//---- label5 ----
				label5.setText(bundle.getString("AccountEditorDialog.label5.text"));
				editorContent.add(label5, cc.xy(1, 13));

				//---- textField5 ----
				textField5.setEditable(false);
				editorContent.add(textField5, cc.xy(3, 13));
			}
			editorPane.add(editorContent, BorderLayout.CENTER);

			//======== editorButtons ========
			{
				editorButtons.setBorder(Borders.BUTTON_BAR_GAP_BORDER);
				editorButtons.setLayout(new FormLayout(
					"$glue, $button, $rgap, $button",
					"pref"));

				//---- editorOk ----
				editorOk.setMnemonic(bundle.getString("AccountEditorDialog.editorOk.mnemonic").charAt(0));
				editorOk.setAction(actionOk);
				editorButtons.add(editorOk, cc.xy(2, 1));

				//---- editorCancel ----
				editorCancel.setMnemonic(bundle.getString("AccountEditorDialog.editorCancel.mnemonic").charAt(0));
				editorCancel.setAction(actionCancel);
				editorButtons.add(editorCancel, cc.xy(4, 1));
			}
			editorPane.add(editorButtons, BorderLayout.SOUTH);
		}
		contentPane.add(editorPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Van Fanel
	private JPanel editorPane;
	private JPanel editorContent;
	private JComponent separator1;
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JComponent separator2;
	private JLabel label3;
	private JTextField textField3;
	private JLabel label4;
	private JTextField textField4;
	private JLabel label5;
	private JTextField textField5;
	private JPanel editorButtons;
	private JButton editorOk;
	private JButton editorCancel;
	private EditorOk actionOk;
	private EditorCancel actionCancel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

	private class EditorOk extends AbstractAction {
		private EditorOk() {
			// JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
			ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");

			putValue(NAME, bundle.getString("AccountEditorDialog.actionOk.Name"));
			putValue(SHORT_DESCRIPTION, bundle.getString("AccountEditorDialog.actionOk.ShortDescription"));
			// JFormDesigner - End of action initialization  //GEN-END:initComponents
		}

		public void actionPerformed(ActionEvent e) {
			accountPresentationModel.triggerCommit();
			canceled = false;
			close();
		}
	}

	private class EditorCancel extends AbstractAction {
		private EditorCancel() {
			// JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
			ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");

			putValue(NAME, bundle.getString("AccountEditorDialog.actionCancel.Name"));
			putValue(SHORT_DESCRIPTION, bundle.getString("AccountEditorDialog.actionCancel.ShortDescription"));
			// JFormDesigner - End of action initialization  //GEN-END:initComponents
		}

		public void actionPerformed(ActionEvent e) {
			accountPresentationModel.triggerFlush();
			canceled = true;
			close();
		}
	}
}// class AccountEditorDialog
