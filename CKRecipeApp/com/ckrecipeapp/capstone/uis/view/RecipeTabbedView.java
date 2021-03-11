package com.ckrecipeapp.capstone.uis.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Label;
import javax.swing.JScrollPane;

public class RecipeTabbedView extends JPanel {
	
	
	public RecipeTabbedView() {
		setVisible(true);
        setEnabled(true);
        		
		JTabbedPane tabbedPane = new JTabbedPane();
		
	
		final JPanel tab1 = new JPanel();
		final JPanel tab2 = new JPanel();
		tab2.setLayout(new CardLayout());
		
		tabbedPane.addTab("tab1", tab1);
		tabbedPane.addTab("tab2", tab2);
		
		
		
	}

}


