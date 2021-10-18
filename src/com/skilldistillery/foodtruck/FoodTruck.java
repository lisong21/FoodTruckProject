package com.skilldistillery.foodtruck;

public class FoodTruck {
	//has data including the ID, which
	//will be generated 
	
	private int numericId;
	public String name;
	public String foodType;
	public int numericRating;
	private static int counter = 0;
	
	public FoodTruck(String name, String foodType, int numericRating ) {
		this.name = name;
		this.foodType = foodType;
		this.numericRating = numericRating;
		this.numericId = counter;
		counter++;
		
	}

	public int getNumericId() {
		return numericId;
	}

	public void setNumericId(int numericId) {
		this.numericId = numericId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getNumericRating() {
		return numericRating;
	}

	public void setNumericRating(int numericRating) {
		this.numericRating = numericRating;
	}

	@Override
	public String toString() {
		return "FoodTruck [numericId=" + numericId + ", name=" + name + ", foodType=" + foodType + ", numericRating="
				+ numericRating + "]";
	}
}
