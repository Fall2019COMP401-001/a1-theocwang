package a1;

import java.util.Arrays;
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
			
			// Scan name and price of item into array
			for (int x = 0; x < nameTable.length; x++) {
				nameTable[x] = scan.next(); 
				priceTable[x] = scan.nextDouble();
				numberCount++;
				}
			
		}
		
		// Scan number of customers and set up variable to keep count
		int customers = scan.nextInt();
		int v = 0;
		
		// Create an array to store the names of customers
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
		
		// Create an array to store prices of items customers bought
		double[] shoppingTrip = new double[customers];
		
		// While loop to keep scanning each customer and their items
		while (numberCustomers < customers) {
			
			// Scan customer first name into array
			int a = 0;
			a = v;
			while (a < firstNames.length) {
				firstNames[a] = scan.next();
			}
			
			// Scan customer last name into array
			int b = 0;
			b = v;
			while (b < lastNames.length) {
				lastNames[b] = scan.next();
			}
			
			// Scan number of items each customer bought
			int itemCount = scan.nextInt();
			
			// Set up variable z and w outside loops
			int z = 0;
			int w = 0;

			// While loop to keep scanning each item each customer bought
			while (numberItems < itemCount) {
				
				// Scan number of each item bought
				int productNumber = scan.nextInt();
				
				// Scan name of each item bought
				String itemNameBought = scan.next();
				
				// Calculate the total cost for each customer
				z = w;
				for (int x = 0; x < customers; x++) {
					for (int y = 0; y <priceTable.length; y++) {
						if (nameTable[y].contentEquals(itemNameBought)) {
							double totalItemCost = priceTable[y] * productNumber;
							while (z < shoppingTrip.length) {
								shoppingTrip[z] = totalItemCost;
								z++;
							}
						}
					}
				}
				numberItems++;
				w++;
			}
			numberCustomers++;	
			v++;
		}
		
		// For loop to find largest amount spent by comparing all elements to each other
		int i = 0;
		int j = 0;
		double max = shoppingTrip[0];
		for (i = 0; i < shoppingTrip.length; i++) {
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
		System.out.println("Biggest: " + firstNames[i-1] + " " + lastNames[i-1] + " " + "(" + max + ")");
		
		// Smallest Spender
		System.out.println("Smallest: " + firstNames[j-1] + " " + lastNames[j-1] + " " + "(" + min + ")");
	
		// Average amount spent by customers
		System.out.println("Average: " + average);
		
		scan.close();
	}
	
}
	
