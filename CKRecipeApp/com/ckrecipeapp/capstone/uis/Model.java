package com.ckrecipeapp.capstone.uis;

import java.util.ArrayList;

public class Model {
	private ArrayList<Recipe> recipes;
	
	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}
	
	public void addRecipe(Recipe recipe) {
		this.recipes.add(recipe);
	}
	
	public void removeRecipe(int index) {
		this.recipes.remove(index);
	}
	
}
