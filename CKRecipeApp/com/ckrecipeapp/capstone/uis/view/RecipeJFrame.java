package com.ckrecipeapp.capstone.uis.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class RecipeJFrame extends JFrame {

	private RecipeSelect rs;
	private CardLayout cl;

		
	/**
	 * Create the frame
	 */
	private static final long serialVersionUID = 2861580930946856409L;

	public RecipeJFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(550, 700);
		this.setVisible(true);
		getContentPane().setLayout(null);
		
		JPanel cardPanel = new JPanel();
		cardPanel.setBounds(128, 0, 410, 665);
		cl = new CardLayout();
		
		cardPanel.setLayout(cl);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		
		JLabel jl1 = new JLabel ("card 10");
		JLabel jl2 = new JLabel ("card 2");
		JLabel jl3 = new JLabel ("card 3");
		JLabel jl4 = new JLabel ("card 4");
		
		jp1.add(jl1);
		jp2.add(jl2);
		jp3.add(jl3);
		jp4.add(jl4);
		
		cardPanel.add(jp1, "1");
		cardPanel.add(jp2, "2");
		cardPanel.add(jp3, "3");
		cardPanel.add(jp4, "4");
		
		getContentPane().add(cardPanel);
		
		buttonPanel();
		
		
	}
	
	public void viewRecipe() {
		
		this.rs = new RecipeSelect(); 
		//getContentPane().add(rs);
	}


	
	public void buttonPanel() {
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 119, 665);
		getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{101, 0};
		gbl_panel.rowHeights = new int[]{23, 23, 23, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnViewR = new JButton("View Recipe");
		GridBagConstraints gbc_btnViewR = new GridBagConstraints();
		gbc_btnViewR.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnViewR.insets = new Insets(0, 0, 5, 0);
		gbc_btnViewR.gridx = 0;
		gbc_btnViewR.gridy = 0;
		panel.add(btnViewR, gbc_btnViewR);		
		
		
		JButton btnCreateR = new JButton("Create Recipe");
		GridBagConstraints gbc_btnCreateR = new GridBagConstraints();
		gbc_btnCreateR.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCreateR.insets = new Insets(0, 0, 5, 0);
		gbc_btnCreateR.gridx = 0;
		gbc_btnCreateR.gridy = 1;
		panel.add(btnCreateR, gbc_btnCreateR);
		//btnCreateR.setSize(new Dimension(110, 30));
		
		JButton btnMealPlan = new JButton("Meal Planner");
		GridBagConstraints gbc_btnMealPlan = new GridBagConstraints();
		gbc_btnMealPlan.insets = new Insets(0, 0, 5, 0);
		gbc_btnMealPlan.fill = GridBagConstraints.BOTH;
		gbc_btnMealPlan.gridx = 0;
		gbc_btnMealPlan.gridy = 2;
		panel.add(btnMealPlan, gbc_btnMealPlan);
		//btnMealPlan.setPreferredSize(new Dimension(110, 30));
		
	}
}
