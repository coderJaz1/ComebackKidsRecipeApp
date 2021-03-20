/**
 * 
 */
package com.ckrecipeapp.capstone.uis;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.ckrecipeapp.capstone.uis.view.*;

/**
 * @author jaz79
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Chris added this comment
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new RecipeJFrame().viewRecipe();
				
				//j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//j.setVisible(true);
				
			}
					
	});
}
}