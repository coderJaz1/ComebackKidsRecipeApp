package com.ckrecipeapp.capstone.uis.view;

import com.ckrecipeapp.capstone.uis.*;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Label;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RecipeViews {

	private JFrame frame;
	//private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeViews window = new RecipeViews();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RecipeViews() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//Creates Tabbed Pane
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 0, 650, 550);
		frame.getContentPane().add(tabbedPane);
		{
			//Creates table on View Recipes tab
			JScrollPane scrollPane = new JScrollPane(tableContents());
			tabbedPane.addTab("View Recipes", null, scrollPane, null);

			//JPanel panelRecipe = makeRecipePanel(null);
			//scrollPane.setColumnHeaderView(panelRecipe);


			JPanel panelCreate = makeCreatePanel(null);
			tabbedPane.addTab("Create Recipe", null, panelCreate, null);

			JPanel panelPlanner = makePlannerPanel(null);
			tabbedPane.addTab("Meal Planner", null, panelPlanner, null);

		}
	}

	private JTable tableContents() {
		JTable table;
		String[] columnNames = {"Title", "Category"};

		Object[][] data = {
				{"Chicken Curry", "Chicken"},
				{"Beef Stroganoff", "Beef"}
		};

		table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension (500,50));


		return table;

	}

	private JPanel makeRecipePanel(String text) {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		text = "test2";
		p.add(new Label(text));
		return p;
	}

	private JPanel makeCreatePanel(String text) {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		text = "test2";
		p.add(new Label(text));
		return p;
	}

	private JPanel makePlannerPanel(String text) {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		text = "test3";
		p.add(new Label(text));
		return p;
	}


}


