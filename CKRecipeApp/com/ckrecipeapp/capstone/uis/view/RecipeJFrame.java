package com.ckrecipeapp.capstone.uis.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

public class RecipeJFrame extends JFrame {

	private RecipeSelect rs;
	private RecipeTabbedView rtv;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2861580930946856409L;

	public RecipeJFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(550, 700);
		this.setVisible(true);
		
		setVisible(true);
        setEnabled(true);
        		
		JTabbedPane tabbedPane = new JTabbedPane();
		
	
		final JPanel tab1 = new JPanel();
		final JPanel tab2 = new JPanel();
		tab2.setLayout(new CardLayout());
		
		tabbedPane.addTab("tab1", tab1);
		tabbedPane.addTab("tab2", tab2);
		

	}
	
	public void viewRecipe() {
		
		this.rs = new RecipeSelect(); 
		this.add(rs);
	}

	public void tabbedView() {
		this.rtv = new RecipeTabbedView();
		this.add(rtv);
		
	}
	 

}
