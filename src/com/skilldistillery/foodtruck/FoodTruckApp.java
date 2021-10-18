package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
	// will have Scanner, menu

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		boolean keepGoing = true;
		

		FoodTruck[] trucks = new FoodTruck[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter the name");
			String foodTruckName = sc.nextLine();
			if (foodTruckName.equals("quit")) {
				System.out.println("goodbye");
				break;

			}

			System.out.println("Please enter the food type");
			String typeFood = sc.nextLine();

			System.out.println("Please enter a rating 1 thru 5");
			int rating = sc.nextInt();
			sc.nextLine();

			FoodTruck foodTruck = new FoodTruck(foodTruckName, typeFood, rating);
			trucks[i] = foodTruck;
		}

		while (keepGoing) {
			String input = "";
			System.out.println("1: list all exisiting food trucks");
			System.out.println("2: see the average rating of food trucks");
			System.out.println("3: display the highest rating food truck");
			System.out.println("4: quit the program");
			input = sc.nextLine();

			switch (input) {
			case "1":
				for (int i = 0; i < trucks.length; i++) {
					if(trucks[i] == null) {
						continue;
					}
					System.out.println(trucks[i]);
				}

				break;
			case "2":
				double total = 0;
				int numTruck = 0;
				for (int i = 0; i < trucks.length; i++) {
					
					if(trucks[i] != null) {
						numTruck++;
						
						total = total + trucks[i].getNumericRating();
					}
						
					

				}
				double average = total / numTruck;
				System.out.println(average);

				break;
			case "3":
				int highestScore = 0;
				String highestScoring = "";
				int id = 0;
				String foodie = "";
				for (int i = 0; i < trucks.length; i++) {
					if(trucks[i] != null) {
						if (highestScore < trucks[i].getNumericRating()) {
							highestScoring = trucks[i].getName();
							id = trucks[i].getNumericId();
							foodie = trucks[i].getFoodType();
							
							highestScore = (int) trucks[i].getNumericRating();
							
						}
						
					}

				}
				System.out.println(highestScore);
				System.out.println(highestScoring + " " + id + " " + " " + foodie);
				

				break;
			case "4":
				System.out.println("goodbye");
				keepGoing = false;

				break;

			}
		}

	}
}
