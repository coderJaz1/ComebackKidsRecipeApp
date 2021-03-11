package com.ckrecipeapp.capstone.uis.view;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class RecipeSelect extends JPanel {
	private JTextField txtTitle;
	private JTextField txtPrepTime;
	private JSpinner spPrepTime;
	private JTextField txtBakeTime;
	private JSpinner spBakeTime;
	private JTextField txtServings;
	private JSpinner spCategory;
	private boolean editOn = false;
	private String title;
	private String prep;
	private String bake;
	private String servings;
	private int category;
	private int spPrep;
	private int spBake;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -57614462823056014L;
	
	/**
	 * Create the panel.  This is the main recipe panel view.
	 */
	public RecipeSelect() {

        setVisible(true);
        setEnabled(true);
        setLayout(null);
        
        txtTitle = new JTextField();
        txtTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle.setEditable(editOn);
		txtTitle.setBounds(10, 15, 515, 20);
		add(txtTitle);
		txtTitle.setColumns(10);
		
        JLabel lblPrepTime = new JLabel("Prep Time");
        lblPrepTime.setBounds(10,50,60,20);
		add(lblPrepTime);
		
		txtPrepTime = new JTextField();
		txtPrepTime.setEditable(editOn);
		txtPrepTime.setBounds(75, 50, 65, 20);
		add(txtPrepTime);
		txtPrepTime.setColumns(10);
		
		spPrepTime = new JSpinner();
		spPrepTime.setBounds(150, 50, 100, 20);
		add(spPrepTime);
		
		JLabel lblBakeTime = new JLabel("Bake Time");
		lblBakeTime.setBounds(10, 90, 65, 20);
		add(lblBakeTime);
		
		txtBakeTime = new JTextField();
		txtBakeTime.setEditable(editOn);
		txtBakeTime.setBounds(75, 90, 65, 20);
		add(txtBakeTime);
		txtBakeTime.setColumns(10);
		
		spBakeTime = new JSpinner();
		spBakeTime.setBounds(150, 90, 100, 20);
		add(spBakeTime);
		
		JLabel lblServings = new JLabel("Servings");
		lblServings.setBounds(300, 50, 60, 20);
		add(lblServings);
		
		txtServings = new JTextField();
		txtServings.setEditable(editOn);
		txtServings.setBounds(360, 50, 100, 20);
		add(txtServings);
		txtServings.setColumns(10);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(300, 90, 60, 20);
		add(lblCategory);
		
		spCategory = new JSpinner();
		spCategory.setBounds(360, 90, 100, 20);
		add(spCategory);
		
		JLabel lblIngredients = new JLabel("Ingredients");
		lblIngredients.setBounds(10, 140, 200, 20);
		add(lblIngredients);
		
		JList lstIngredients = new JList();
		lstIngredients.setBounds(10, 165, 200, 400);
		add(lstIngredients);
				
		JLabel lblSteps = new JLabel("Steps");
		lblSteps.setBounds(225, 140, 400, 20);
		add(lblSteps);
		
		JList lstSteps = new JList();
		lstSteps.setBounds(225, 165, 300, 400);
		add(lstSteps);			
		
		JButton btnAddIng = new JButton("Add Ingredient");
		btnAddIng.setBounds(50, 590, 130, 25);
		btnAddIng.setVisible(editOn);
		add(btnAddIng);
		

		JButton btnSaveRecipe = new JButton("Save Recipe");
		btnSaveRecipe.setBounds(240, 590, 120, 25);
		btnSaveRecipe.setVisible(editOn);
		add(btnSaveRecipe);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(410, 590, 90, 25);
		btnCancel.setVisible(editOn);
		add(btnCancel);
		
		

	}

	
	
//Getters and Setters for variables
	public void setEditOn (boolean editOn) {
		this.editOn = editOn;
	}
	
	public Boolean isEditOn() {
		return this.editOn;
	}
	
	public void setTitle (String title) {
		this.txtTitle.setText(title);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrepTime (String prep) {
		this.txtPrepTime.setText(prep);
	}
	
	public String getPrepTime() {
		return prep;
	}
	
	public void setBakeTime (String bake) {
		this.txtBakeTime.setText(bake);
	}
	
	public String getBakeTime() {
		return bake;
	}
	
	public void setServings (String servings) {
		this.txtServings.setText(servings);
	}
	
	public String getServings() {
		return servings;
	}
	
	public void setCategory (int category) {
		this.spCategory.setValue(category);
	}
	
	public int getCategory() {
		return category;
	}
	
	public void setSpPrepTime (int spPrep) {
		this.spPrepTime.setValue(spPrep);
	}
	
	public int getSpPrepTime() {
		return spPrep;
	}
	
	public void setSpBakeTime (int spBake) {
		this.spBakeTime.setValue(spBake);
	}
	
	public int getSpBakeTime() {
		return spBake;
	}
}
