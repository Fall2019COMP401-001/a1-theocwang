package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Space for any possible variables I need
		int numberCount = 0;
		int numberCustomers = 0;
		int numberItems = 0;
		
		// Scan number of items in store
		int count = scan.nextInt();
		
		// Create an array to store names and prices of products
		String[] nameTable = new String[count];
		double[] priceTable = new double[count];
		
		// While loop to keep scanning all items in store
		while (numberCount < count) {
			
			// Scan name of item into array
			for (int x = 0; x < nameTable.length; x++) {
					nameTable[x] = scan.next();
				}
			
			// Scan price of item into array
			for (int y = 0; y < priceTable.length; y++) {
				priceTable[y] = scan.nextDouble();
			}
			
			numberCount++;
			
		}
		
		// Scan number of customers
		int customers = scan.nextInt();
		
		// Create an array to store the names of customers
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
		
		// Create an array to store prices of items customers bought
		double[] shoppingTrip = new double[customers];
		
		// While loop to keep scanning each customer and their items
		while (numberCustomers < customers) {
			
			// Scan customer first name into array
			for (int a = 0; a < firstNames.length; a++) {
				firstNames[a] = scan.next();
			}
			
			// Scan customer last name into array
			for (int b = 0; b < lastNames.length; b++) {
				lastNames[b] = scan.next();
			}
			
			// Scan number of items each customer bought
			int itemCount = scan.nextInt();
			
			// While loop to keep scanning each item each customer bought
			while (numberItems < itemCount) {
				
				// Scan number of each item bought
				int productNumber = scan.nextInt();
				
				// Scan name of each item bought
				String itemNameBought = scan.next();
				
				// Calculate the total cost for each customer
				for (int x = 0; x < nameTable.length; x++) {
					for (int y = 0; y <priceTable.length; y++) {
						if (nameTable[x].equals(itemNameBought)) {
							double totalItemCost = priceTable[y] * productNumber;
							for (int z = 0; z < shoppingTrip.length; z++) {
								shoppingTrip[z] = totalItemCost;
							}
						}
						
					}
				
				}
				
				numberCustomers++;
				
			}
			
		}
		
		// For loop to find largest amount spent by comparing all elements to each other
		int i = 0;
		int j = 0;
		double max = shoppingTrip[0];
		for (i = 0; i < shoppingTrip.length; i++ ) {
			if (shoppingTrip[i] > max) {
				max = shoppingTrip[i];
			}
		}
		
		// For loop to find smallest amount spent by comparing all elements in array
		double min = shoppingTrip[0];
		for (j = 0; j < shoppingTrip.length; j++) {
			if (shoppingTrip[j] < min) {
				min = shoppingTrip[j];
			}
		}
		
		// Average amount spent calculated by summing all prices and dividing by number of customers
		double sum = 0;
		for (double element: shoppingTrip) {
			sum += element;
		}
		double average = sum / shoppingTrip.length;
		
		// Biggest Spender
		System.out.println("Biggest: " + firstNames[i] + " " + lastNames[i] + " " + "(" + max + ")");
		
		// Smallest Spender
		System.out.println("Smallest: " + firstNames[j] + " " + lastNames[j] + " " + "(" + min + ")");
	
		// Average amount spent by customers
		System.out.println("Average: " + average);
	}
	
}
	
