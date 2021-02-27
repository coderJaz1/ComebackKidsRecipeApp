package com.ckrecipeapp.capstone.uis;

import java.util.HashMap;

public class Recipe {
	private int id;
	private String name;
	private int totalTime;
	private String mealType;
	private String protein;
	private String description;
	private HashMap<String, String> ingredientInstructions;

	public Recipe(int id, String name, int time, String protein, String description, HashMap<String, String> ingredientInstructions) {
		this.id = id;
		this.name = name;
		this.totalTime = time;
		this.protein = protein;
		this.description = description;
		this.ingredientInstructions = ingredientInstructions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public String getMealType() {
		return mealType;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public String getProtein() {
		return protein;
	}

	public void setProtein(String protein) {
		this.protein = protein;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HashMap<String, String> getIngredientInstructions() {
		return ingredientInstructions;
	}

	public void setIngredientInstructions(HashMap<String, String> ingredientInstructions) {
		this.ingredientInstructions = ingredientInstructions;
	}

}
