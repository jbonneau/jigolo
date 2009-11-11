/*
 * Created by JFormDesigner on Mon Aug 25 15:06:30 CEST 2008
 */

package com.gui;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;
import com.jgoodies.uif_lite.component.*;
import com.jgoodies.uif_lite.panel.*;

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
		// Generated using JFormDesigner Evaluation license - Van Fanel
		ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");
		menuTop = new JMenuBar();
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
		frameLeft = new SimpleInternalFrame();
		tabsLeft = new JTabbedPane();
		uIFSplitPane2 = new UIFSplitPane();
		uIFSplitPane3 = new UIFSplitPane();
		frameCenter = new SimpleInternalFrame();
		tabsCenter = new JTabbedPane();
		panelGoban = new JPanel();
		frameRight = new SimpleInternalFrame();
		tabsRight = new JTabbedPane();
		frameBottom = new SimpleInternalFrame();
		tabsBottom = new JTabbedPane();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setTitle(bundle.getString("IHM.this.title"));
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout(
			"[1010px,default]",
			"[710px,default]"));

		//======== menuTop ========
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
			menuTop.add(menu1);

			//======== menu2 ========
			{
				menu2.setText(bundle.getString("IHM.menu2.text"));

				//---- menuItem6 ----
				menuItem6.setText(bundle.getString("IHM.menuItem6.text"));
				menu2.add(menuItem6);
			}
			menuTop.add(menu2);

			//======== menu3 ========
			{
				menu3.setText(bundle.getString("IHM.menu3.text"));

				//---- menuItem5 ----
				menuItem5.setText(bundle.getString("IHM.menuItem5.text"));
				menu3.add(menuItem5);
			}
			menuTop.add(menu3);

			//======== menu4 ========
			{
				menu4.setText(bundle.getString("IHM.menu4.text"));
			}
			menuTop.add(menu4);

			//======== menu5 ========
			{
				menu5.setText(bundle.getString("IHM.menu5.text"));

				//---- menuItem4 ----
				menuItem4.setText(bundle.getString("IHM.menuItem4.text"));
				menu5.add(menuItem4);
			}
			menuTop.add(menu5);

			//======== menu6 ========
			{
				menu6.setText(bundle.getString("IHM.menu6.text"));

				//---- menuItem3 ----
				menuItem3.setText(bundle.getString("IHM.menuItem3.text"));
				menu6.add(menuItem3);
			}
			menuTop.add(menu6);
		}
		setJMenuBar(menuTop);

		//======== uIFSplitPane1 ========
		{

			//======== frameLeft ========
			{
				frameLeft.setTitle(bundle.getString("IHM.frameLeft.title"));

				// JFormDesigner evaluation mark
				frameLeft.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), frameLeft.getBorder())); frameLeft.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

				Container frameLeftContentPane = frameLeft.getContentPane();
				frameLeftContentPane.setLayout(new FormLayout(
					"default",
					"default"));
				frameLeftContentPane.add(tabsLeft, cc.xy(1, 1));
			}
			uIFSplitPane1.setLeftComponent(frameLeft);

			//======== uIFSplitPane2 ========
			{
				uIFSplitPane2.setOrientation(JSplitPane.VERTICAL_SPLIT);

				//======== uIFSplitPane3 ========
				{

					//======== frameCenter ========
					{
						frameCenter.setTitle(bundle.getString("IHM.frameCenter.title"));
						Container frameCenterContentPane = frameCenter.getContentPane();
						frameCenterContentPane.setLayout(new FormLayout(
							"default",
							"default"));

						//======== tabsCenter ========
						{

							//======== panelGoban ========
							{
								panelGoban.setLayout(new GridBagLayout());
								((GridBagLayout)panelGoban.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
								((GridBagLayout)panelGoban.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
								((GridBagLayout)panelGoban.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
								((GridBagLayout)panelGoban.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
							}
							tabsCenter.addTab(bundle.getString("IHM.panelGoban.tab.title"), panelGoban);

						}
						frameCenterContentPane.add(tabsCenter, cc.xy(1, 1));
					}
					uIFSplitPane3.setLeftComponent(frameCenter);

					//======== frameRight ========
					{
						frameRight.setTitle(bundle.getString("IHM.frameRight.title"));
						Container frameRightContentPane = frameRight.getContentPane();
						frameRightContentPane.setLayout(new FormLayout(
							"default",
							"default"));
						frameRightContentPane.add(tabsRight, cc.xy(1, 1));
					}
					uIFSplitPane3.setRightComponent(frameRight);
				}
				uIFSplitPane2.setTopComponent(uIFSplitPane3);

				//======== frameBottom ========
				{
					frameBottom.setTitle(bundle.getString("IHM.frameBottom.title"));
					Container frameBottomContentPane = frameBottom.getContentPane();
					frameBottomContentPane.setLayout(new FormLayout(
						"default",
						"default"));
					frameBottomContentPane.add(tabsBottom, cc.xy(1, 1));
				}
				uIFSplitPane2.setBottomComponent(frameBottom);
			}
			uIFSplitPane1.setRightComponent(uIFSplitPane2);
		}
		contentPane.add(uIFSplitPane1, cc.xy(1, 1));
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Van Fanel
	private JMenuBar menuTop;
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
	private SimpleInternalFrame frameLeft;
	private JTabbedPane tabsLeft;
	private UIFSplitPane uIFSplitPane2;
	private UIFSplitPane uIFSplitPane3;
	private SimpleInternalFrame frameCenter;
	private JTabbedPane tabsCenter;
	private JPanel panelGoban;
	private SimpleInternalFrame frameRight;
	private JTabbedPane tabsRight;
	private SimpleInternalFrame frameBottom;
	private JTabbedPane tabsBottom;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
