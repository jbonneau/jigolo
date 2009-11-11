/*
 * Created by JFormDesigner on Fri Oct 03 11:29:47 CEST 2008
 */

package com.gui.goban;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * @author Van Fanel
 */
public class GobanView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GobanView() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Van Fanel
		ResourceBundle bundle = ResourceBundle.getBundle("com.resource.locale");
		caseV1 = new JButton();
		caseV2 = new JButton();
		caseV3 = new JButton();
		caseV4 = new JButton();
		caseV5 = new JButton();
		caseV6 = new JButton();
		caseV7 = new JButton();
		caseV8 = new JButton();
		caseV9 = new JButton();
		caseH9 = new JButton();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		caseH8 = new JButton();
		button10 = new JButton();
		button11 = new JButton();
		button12 = new JButton();
		button13 = new JButton();
		button14 = new JButton();
		button15 = new JButton();
		button16 = new JButton();
		button17 = new JButton();
		button18 = new JButton();
		caseH7 = new JButton();
		button19 = new JButton();
		button20 = new JButton();
		button21 = new JButton();
		button22 = new JButton();
		button23 = new JButton();
		button24 = new JButton();
		button25 = new JButton();
		button26 = new JButton();
		button27 = new JButton();
		caseH6 = new JButton();
		button28 = new JButton();
		button29 = new JButton();
		button30 = new JButton();
		button31 = new JButton();
		button32 = new JButton();
		button33 = new JButton();
		button34 = new JButton();
		button35 = new JButton();
		button36 = new JButton();
		caseH5 = new JButton();
		button37 = new JButton();
		button38 = new JButton();
		button39 = new JButton();
		button40 = new JButton();
		button41 = new JButton();
		button42 = new JButton();
		button43 = new JButton();
		button44 = new JButton();
		button45 = new JButton();
		caseH4 = new JButton();
		button46 = new JButton();
		button47 = new JButton();
		button48 = new JButton();
		button49 = new JButton();
		button50 = new JButton();
		button51 = new JButton();
		button52 = new JButton();
		button53 = new JButton();
		button54 = new JButton();
		caseH3 = new JButton();
		button55 = new JButton();
		button56 = new JButton();
		button57 = new JButton();
		button58 = new JButton();
		button59 = new JButton();
		button60 = new JButton();
		button61 = new JButton();
		button62 = new JButton();
		button63 = new JButton();
		caseH2 = new JButton();
		button64 = new JButton();
		button65 = new JButton();
		button66 = new JButton();
		button67 = new JButton();
		button68 = new JButton();
		button69 = new JButton();
		button70 = new JButton();
		button71 = new JButton();
		button72 = new JButton();
		caseH1 = new JButton();
		button73 = new JButton();
		button74 = new JButton();
		button75 = new JButton();
		button76 = new JButton();
		button77 = new JButton();
		button78 = new JButton();
		button79 = new JButton();
		button80 = new JButton();
		button81 = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

		//---- caseV1 ----
		caseV1.setText(bundle.getString("GobanView.caseV1.text"));
		add(caseV1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseV2 ----
		caseV2.setText(bundle.getString("GobanView.caseV2.text"));
		add(caseV2, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseV3 ----
		caseV3.setText(bundle.getString("GobanView.caseV3.text"));
		add(caseV3, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseV4 ----
		caseV4.setText(bundle.getString("GobanView.caseV4.text"));
		add(caseV4, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseV5 ----
		caseV5.setText(bundle.getString("GobanView.caseV5.text"));
		add(caseV5, new GridBagConstraints(6, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseV6 ----
		caseV6.setText(bundle.getString("GobanView.caseV6.text"));
		add(caseV6, new GridBagConstraints(7, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseV7 ----
		caseV7.setText(bundle.getString("GobanView.caseV7.text"));
		add(caseV7, new GridBagConstraints(8, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseV8 ----
		caseV8.setText(bundle.getString("GobanView.caseV8.text"));
		add(caseV8, new GridBagConstraints(9, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseV9 ----
		caseV9.setText(bundle.getString("GobanView.caseV9.text"));
		add(caseV9, new GridBagConstraints(10, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseH9 ----
		caseH9.setText(bundle.getString("GobanView.caseH9.text"));
		add(caseH9, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button1 ----
		button1.setText(bundle.getString("GobanView.button1.text"));
		add(button1, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button2 ----
		button2.setText(bundle.getString("GobanView.button2.text"));
		add(button2, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button3 ----
		button3.setText(bundle.getString("GobanView.button3.text"));
		add(button3, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button4 ----
		button4.setText(bundle.getString("GobanView.button4.text"));
		add(button4, new GridBagConstraints(5, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button5 ----
		button5.setText(bundle.getString("GobanView.button5.text"));
		add(button5, new GridBagConstraints(6, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button6 ----
		button6.setText(bundle.getString("GobanView.button6.text"));
		add(button6, new GridBagConstraints(7, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button7 ----
		button7.setText(bundle.getString("GobanView.button7.text"));
		add(button7, new GridBagConstraints(8, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button8 ----
		button8.setText(bundle.getString("GobanView.button8.text"));
		add(button8, new GridBagConstraints(9, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button9 ----
		button9.setText(bundle.getString("GobanView.button9.text"));
		add(button9, new GridBagConstraints(10, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseH8 ----
		caseH8.setText(bundle.getString("GobanView.caseH8.text"));
		add(caseH8, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button10 ----
		button10.setText(bundle.getString("GobanView.button10.text"));
		add(button10, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button11 ----
		button11.setText(bundle.getString("GobanView.button11.text"));
		add(button11, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button12 ----
		button12.setText(bundle.getString("GobanView.button12.text"));
		add(button12, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button13 ----
		button13.setText(bundle.getString("GobanView.button13.text"));
		add(button13, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button14 ----
		button14.setText(bundle.getString("GobanView.button14.text"));
		add(button14, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button15 ----
		button15.setText(bundle.getString("GobanView.button15.text"));
		add(button15, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button16 ----
		button16.setText(bundle.getString("GobanView.button16.text"));
		add(button16, new GridBagConstraints(8, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button17 ----
		button17.setText(bundle.getString("GobanView.button17.text"));
		add(button17, new GridBagConstraints(9, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button18 ----
		button18.setText(bundle.getString("GobanView.button18.text"));
		add(button18, new GridBagConstraints(10, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseH7 ----
		caseH7.setText(bundle.getString("GobanView.caseH7.text"));
		add(caseH7, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button19 ----
		button19.setText(bundle.getString("GobanView.button19.text"));
		add(button19, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button20 ----
		button20.setText(bundle.getString("GobanView.button20.text"));
		add(button20, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button21 ----
		button21.setText(bundle.getString("GobanView.button21.text"));
		add(button21, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button22 ----
		button22.setText(bundle.getString("GobanView.button22.text"));
		add(button22, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button23 ----
		button23.setText(bundle.getString("GobanView.button23.text"));
		add(button23, new GridBagConstraints(6, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button24 ----
		button24.setText(bundle.getString("GobanView.button24.text"));
		add(button24, new GridBagConstraints(7, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button25 ----
		button25.setText(bundle.getString("GobanView.button25.text"));
		add(button25, new GridBagConstraints(8, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button26 ----
		button26.setText(bundle.getString("GobanView.button26.text"));
		add(button26, new GridBagConstraints(9, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button27 ----
		button27.setText(bundle.getString("GobanView.button27.text"));
		add(button27, new GridBagConstraints(10, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseH6 ----
		caseH6.setText(bundle.getString("GobanView.caseH6.text"));
		add(caseH6, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button28 ----
		button28.setText(bundle.getString("GobanView.button28.text"));
		add(button28, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button29 ----
		button29.setText(bundle.getString("GobanView.button29.text"));
		add(button29, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button30 ----
		button30.setText(bundle.getString("GobanView.button30.text"));
		add(button30, new GridBagConstraints(4, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button31 ----
		button31.setText(bundle.getString("GobanView.button31.text"));
		add(button31, new GridBagConstraints(5, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button32 ----
		button32.setText(bundle.getString("GobanView.button32.text"));
		add(button32, new GridBagConstraints(6, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button33 ----
		button33.setText(bundle.getString("GobanView.button33.text"));
		add(button33, new GridBagConstraints(7, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button34 ----
		button34.setText(bundle.getString("GobanView.button34.text"));
		add(button34, new GridBagConstraints(8, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button35 ----
		button35.setText(bundle.getString("GobanView.button35.text"));
		add(button35, new GridBagConstraints(9, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button36 ----
		button36.setText(bundle.getString("GobanView.button36.text"));
		add(button36, new GridBagConstraints(10, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseH5 ----
		caseH5.setText(bundle.getString("GobanView.caseH5.text"));
		add(caseH5, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button37 ----
		button37.setText(bundle.getString("GobanView.button37.text"));
		add(button37, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button38 ----
		button38.setText(bundle.getString("GobanView.button38.text"));
		add(button38, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button39 ----
		button39.setText(bundle.getString("GobanView.button39.text"));
		add(button39, new GridBagConstraints(4, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button40 ----
		button40.setText(bundle.getString("GobanView.button40.text"));
		add(button40, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button41 ----
		button41.setText(bundle.getString("GobanView.button41.text"));
		add(button41, new GridBagConstraints(6, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button42 ----
		button42.setText(bundle.getString("GobanView.button42.text"));
		add(button42, new GridBagConstraints(7, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button43 ----
		button43.setText(bundle.getString("GobanView.button43.text"));
		add(button43, new GridBagConstraints(8, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button44 ----
		button44.setText(bundle.getString("GobanView.button44.text"));
		add(button44, new GridBagConstraints(9, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button45 ----
		button45.setText(bundle.getString("GobanView.button45.text"));
		add(button45, new GridBagConstraints(10, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseH4 ----
		caseH4.setText(bundle.getString("GobanView.caseH4.text"));
		add(caseH4, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button46 ----
		button46.setText(bundle.getString("GobanView.button46.text"));
		add(button46, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button47 ----
		button47.setText(bundle.getString("GobanView.button47.text"));
		add(button47, new GridBagConstraints(3, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button48 ----
		button48.setText(bundle.getString("GobanView.button48.text"));
		add(button48, new GridBagConstraints(4, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button49 ----
		button49.setText(bundle.getString("GobanView.button49.text"));
		add(button49, new GridBagConstraints(5, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button50 ----
		button50.setText(bundle.getString("GobanView.button50.text"));
		add(button50, new GridBagConstraints(6, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button51 ----
		button51.setText(bundle.getString("GobanView.button51.text"));
		add(button51, new GridBagConstraints(7, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button52 ----
		button52.setText(bundle.getString("GobanView.button52.text"));
		add(button52, new GridBagConstraints(8, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button53 ----
		button53.setText(bundle.getString("GobanView.button53.text"));
		add(button53, new GridBagConstraints(9, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button54 ----
		button54.setText(bundle.getString("GobanView.button54.text"));
		add(button54, new GridBagConstraints(10, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseH3 ----
		caseH3.setText(bundle.getString("GobanView.caseH3.text"));
		add(caseH3, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button55 ----
		button55.setText(bundle.getString("GobanView.button55.text"));
		add(button55, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button56 ----
		button56.setText(bundle.getString("GobanView.button56.text"));
		add(button56, new GridBagConstraints(3, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button57 ----
		button57.setText(bundle.getString("GobanView.button57.text"));
		add(button57, new GridBagConstraints(4, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button58 ----
		button58.setText(bundle.getString("GobanView.button58.text"));
		add(button58, new GridBagConstraints(5, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button59 ----
		button59.setText(bundle.getString("GobanView.button59.text"));
		add(button59, new GridBagConstraints(6, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button60 ----
		button60.setText(bundle.getString("GobanView.button60.text"));
		add(button60, new GridBagConstraints(7, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button61 ----
		button61.setText(bundle.getString("GobanView.button61.text"));
		add(button61, new GridBagConstraints(8, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button62 ----
		button62.setText(bundle.getString("GobanView.button62.text"));
		add(button62, new GridBagConstraints(9, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button63 ----
		button63.setText(bundle.getString("GobanView.button63.text"));
		add(button63, new GridBagConstraints(10, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseH2 ----
		caseH2.setText(bundle.getString("GobanView.caseH2.text"));
		add(caseH2, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button64 ----
		button64.setText(bundle.getString("GobanView.button64.text"));
		add(button64, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button65 ----
		button65.setText(bundle.getString("GobanView.button65.text"));
		add(button65, new GridBagConstraints(3, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button66 ----
		button66.setText(bundle.getString("GobanView.button66.text"));
		add(button66, new GridBagConstraints(4, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button67 ----
		button67.setText(bundle.getString("GobanView.button67.text"));
		add(button67, new GridBagConstraints(5, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button68 ----
		button68.setText(bundle.getString("GobanView.button68.text"));
		add(button68, new GridBagConstraints(6, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button69 ----
		button69.setText(bundle.getString("GobanView.button69.text"));
		add(button69, new GridBagConstraints(7, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button70 ----
		button70.setText(bundle.getString("GobanView.button70.text"));
		add(button70, new GridBagConstraints(8, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button71 ----
		button71.setText(bundle.getString("GobanView.button71.text"));
		add(button71, new GridBagConstraints(9, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button72 ----
		button72.setText(bundle.getString("GobanView.button72.text"));
		add(button72, new GridBagConstraints(10, 9, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- caseH1 ----
		caseH1.setText(bundle.getString("GobanView.caseH1.text"));
		add(caseH1, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button73 ----
		button73.setText(bundle.getString("GobanView.button73.text"));
		add(button73, new GridBagConstraints(2, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button74 ----
		button74.setText(bundle.getString("GobanView.button74.text"));
		add(button74, new GridBagConstraints(3, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button75 ----
		button75.setText(bundle.getString("GobanView.button75.text"));
		add(button75, new GridBagConstraints(4, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button76 ----
		button76.setText(bundle.getString("GobanView.button76.text"));
		add(button76, new GridBagConstraints(5, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button77 ----
		button77.setText(bundle.getString("GobanView.button77.text"));
		add(button77, new GridBagConstraints(6, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button78 ----
		button78.setText(bundle.getString("GobanView.button78.text"));
		add(button78, new GridBagConstraints(7, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button79 ----
		button79.setText(bundle.getString("GobanView.button79.text"));
		add(button79, new GridBagConstraints(8, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button80 ----
		button80.setText(bundle.getString("GobanView.button80.text"));
		add(button80, new GridBagConstraints(9, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- button81 ----
		button81.setText(bundle.getString("GobanView.button81.text"));
		add(button81, new GridBagConstraints(10, 10, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Van Fanel
	private JButton caseV1;
	private JButton caseV2;
	private JButton caseV3;
	private JButton caseV4;
	private JButton caseV5;
	private JButton caseV6;
	private JButton caseV7;
	private JButton caseV8;
	private JButton caseV9;
	private JButton caseH9;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton caseH8;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	private JButton button16;
	private JButton button17;
	private JButton button18;
	private JButton caseH7;
	private JButton button19;
	private JButton button20;
	private JButton button21;
	private JButton button22;
	private JButton button23;
	private JButton button24;
	private JButton button25;
	private JButton button26;
	private JButton button27;
	private JButton caseH6;
	private JButton button28;
	private JButton button29;
	private JButton button30;
	private JButton button31;
	private JButton button32;
	private JButton button33;
	private JButton button34;
	private JButton button35;
	private JButton button36;
	private JButton caseH5;
	private JButton button37;
	private JButton button38;
	private JButton button39;
	private JButton button40;
	private JButton button41;
	private JButton button42;
	private JButton button43;
	private JButton button44;
	private JButton button45;
	private JButton caseH4;
	private JButton button46;
	private JButton button47;
	private JButton button48;
	private JButton button49;
	private JButton button50;
	private JButton button51;
	private JButton button52;
	private JButton button53;
	private JButton button54;
	private JButton caseH3;
	private JButton button55;
	private JButton button56;
	private JButton button57;
	private JButton button58;
	private JButton button59;
	private JButton button60;
	private JButton button61;
	private JButton button62;
	private JButton button63;
	private JButton caseH2;
	private JButton button64;
	private JButton button65;
	private JButton button66;
	private JButton button67;
	private JButton button68;
	private JButton button69;
	private JButton button70;
	private JButton button71;
	private JButton button72;
	private JButton caseH1;
	private JButton button73;
	private JButton button74;
	private JButton button75;
	private JButton button76;
	private JButton button77;
	private JButton button78;
	private JButton button79;
	private JButton button80;
	private JButton button81;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
