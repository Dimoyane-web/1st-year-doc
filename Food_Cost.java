import java.util.Scanner; //import scanner file from the java.util package

public class Food_Cost { //start of the class
	
	
	public static void main(string[] args) { //start of the main method
		
		//create an object file from the scanner
		Scanner kb = new Scanner(System.in);
		
		//declaring constant variables
		final double PLATE = 1.05; //plate weighs 1.05 kg
		final double FOOD_UNIT = 100.0; //cost is calculated per 100g food
		final double COST_PER_UNIT = 7.35; //R7.35 per 100 g 
		final double VAT_PERC = 0.15; //VAT in South Africa in 2021
		
		//declaring variables
		double food_Weight,total_Weight,foodPlusPlate;
		
		//prompting the user to enter food weight on the plate
		System.out.print("Weight of food plus plate in kg: ");
		foodPlusPlate = kb.nextDouble();
		
		//processing 
		total_Weight = foodPlusPlate - PLATE;
		CostOfaFood = total_Weight *
		
		
		cost = 