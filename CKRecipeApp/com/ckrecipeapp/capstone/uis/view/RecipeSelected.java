package com.ckrecipeapp.capstone.uis.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JList;
import javax.swing.JSpinner;

@SuppressWarnings("serial")
public class RecipeSelected extends JPanel {
	private JTextField txtPrepTime;
	private JTextField txtBakeTime;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public RecipeSelected() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JLabel lblTitle = new JLabel("Title");
		add(lblTitle, "1, 2, 10, 1");
		
		JLabel lblPrepTime = new JLabel("Prep Time");
		add(lblPrepTime, "2, 4, right, default");
		
		txtPrepTime = new JTextField();
		add(txtPrepTime, "4, 4, fill, default");
		txtPrepTime.setColumns(10);
		
		JLabel lblBakeTime = new JLabel("Bake Time");
		add(lblBakeTime, "6, 4, right, default");
		
		txtBakeTime = new JTextField();
		add(txtBakeTime, "8, 4, fill, default");
		txtBakeTime.setColumns(10);
		
		JLabel lblServings = new JLabel("Servings");
		add(lblServings, "2, 6, right, default");
		
		textField = new JTextField();
		add(textField, "4, 6, fill, default");
		textField.setColumns(10);
		
		JLabel lblCategory = new JLabel("Category");
		add(lblCategory, "6, 6");
		
		JSpinner spinnerCategory = new JSpinner();
		add(spinnerCategory, "8, 6");
		
		JLabel lblIngredients = new JLabel("Ingredients");
		add(lblIngredients, "2, 8");
		
		JList lstIngredients = new JList();
		lstIngredients.setVisibleRowCount(14);
		add(lstIngredients, "4, 8, 5, 1, fill, fill");
		
		JLabel lblSteps = new JLabel("Steps");
		add(lblSteps, "2, 10");
		
		JList list = new JList();
		add(list, "4, 10, 5, 1, fill, fill");
		
		

	}

}
