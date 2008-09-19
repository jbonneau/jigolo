/*
 * Created by JFormDesigner on Mon Aug 25 15:06:30 CEST 2008
 */

package com.gui;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;
import com.jgoodies.uif_lite.component.*;

/**
 * @author LhaaG
 */
@SuppressWarnings("serial")
public class IHM extends JFrame {
	public IHM() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menuItem2 = new JMenuItem();
		menu2 = new JMenu();
		menuItem6 = new JMenuItem();
		menu3 = new JMenu();
		menuItem5 = new JMenuItem();
		menu4 = new JMenu();
		menu5 = new JMenu();
		menuItem4 = new JMenuItem();
		menu6 = new JMenu();
		menuItem3 = new JMenuItem();
		uIFSplitPane1 = new UIFSplitPane();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setTitle(bundle.getString("IHM.this.title"));
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout(
			"[1010px,default]",
			"[710px,default]"));

		//======== menuBar1 ========
		{

			//======== menu1 ========
			{
				menu1.setText(bundle.getString("IHM.menu1.text"));

				//---- menuItem1 ----
				menuItem1.setText(bundle.getString("IHM.menuItem1.text"));
				menu1.add(menuItem1);

				//---- menuItem2 ----
				menuItem2.setText(bundle.getString("IHM.menuItem2.text"));
				menu1.add(menuItem2);
			}
			menuBar1.add(menu1);

			//======== menu2 ========
			{
				menu2.setText(bundle.getString("IHM.menu2.text"));

				//---- menuItem6 ----
				menuItem6.setText(bundle.getString("IHM.menuItem6.text"));
				menu2.add(menuItem6);
			}
			menuBar1.add(menu2);

			//======== menu3 ========
			{
				menu3.setText(bundle.getString("IHM.menu3.text"));

				//---- menuItem5 ----
				menuItem5.setText(bundle.getString("IHM.menuItem5.text"));
				menu3.add(menuItem5);
			}
			menuBar1.add(menu3);

			//======== menu4 ========
			{
				menu4.setText(bundle.getString("IHM.menu4.text"));
			}
			menuBar1.add(menu4);

			//======== menu5 ========
			{
				menu5.setText(bundle.getString("IHM.menu5.text"));

				//---- menuItem4 ----
				menuItem4.setText(bundle.getString("IHM.menuItem4.text"));
				menu5.add(menuItem4);
			}
			menuBar1.add(menu5);

			//======== menu6 ========
			{
				menu6.setText(bundle.getString("IHM.menu6.text"));

				//---- menuItem3 ----
				menuItem3.setText(bundle.getString("IHM.menuItem3.text"));
				menu6.add(menuItem3);
			}
			menuBar1.add(menu6);
		}
		setJMenuBar(menuBar1);
		contentPane.add(uIFSplitPane1, cc.xy(1, 1));
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem1;
	private JMenuItem menuItem2;
	private JMenu menu2;
	private JMenuItem menuItem6;
	private JMenu menu3;
	private JMenuItem menuItem5;
	private JMenu menu4;
	private JMenu menu5;
	private JMenuItem menuItem4;
	private JMenu menu6;
	private JMenuItem menuItem3;
	private UIFSplitPane uIFSplitPane1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
