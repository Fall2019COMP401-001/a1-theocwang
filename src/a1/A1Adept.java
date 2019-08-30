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
		Object[][] name_priceTable = new Object[count][2];
		
		// While loop to keep scanning all items in store
		while (numberCount < count) {
			
			// Scan name and price of item into array
			for (int x = 0; x < name_priceTable.length; x++) {
				name_priceTable[x][0] = scan.next(); 
				name_priceTable[x][1] = scan.nextDouble();
				numberCount++;
				}
			
		}
		
		// Scan number of customers and set up variable to keep count
		int customers = scan.nextInt();
		int v = 0;
		
		// Create an array to store the names of customers
		String[][] names = new String[customers][2];

		// Create an array to store prices of items customers bought
		double[] shoppingTrip = new double[customers];
		
		// Create an array to store sums of prices for each customer
		double[] sums = new double[customers];
		
		// While loop to keep scanning each customer and their items
		while (numberCustomers < customers) {
			
			// Scan customer first name into array
			for (int a = 0; a < 1; a++) {
				names[v][0] = scan.next();
				names[v][1] = scan.next();
			}
			
			// Scan number of items each customer bought
			int itemCount = scan.nextInt();
			
			// Set up necessary variables outside loops
			int z = 0;
			int w = 0;
			int d = 0;
			int u = 0;

			// While loop to keep scanning each item each customer bought
			while (numberItems < itemCount) {
				
				// Scan number of each item bought
				int productNumber = scan.nextInt();
				
				// Scan name of each item bought
				String itemNameBought = scan.next();
				
				// Calculate the total cost for each customer per item quantity
				z = w;
				for (int x = 0; x < customers; x++) {
					for (int y = 0; y <name_priceTable.length; y++) {
						String str = (name_priceTable[y][1]).toString();
						if (name_priceTable[y][0] == itemNameBought) {
							double totalItemCost = Double.valueOf(str) * productNumber;
							while (z < shoppingTrip.length) {
								shoppingTrip[z] = totalItemCost;
								z++;
							}
						}
					}
				}
				// Sum up each customer's purchases
				int sum = 0;
				for (int c = 0; c < shoppingTrip.length; c++) {
					sum += shoppingTrip[c];
				}
				// Set up while loop to add sums to sums array
				d = u;
				while (d < shoppingTrip.length) {
					sums[d] = sum;
					u++;
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
		double max = sums[0];
		for (i = 0; i < sums.length; i++) {
			if (sums[i] > max) {
				max = sums[i];
			}
		}
		
		// For loop to find smallest amount spent by comparing all elements in array
		double min = sums[0];
		for (j = 0; j < sums.length; j++) {
			if (sums[j] < min) {
				min = sums[j];
			}
		}
		
		// Average amount spent calculated by summing all prices and dividing by number of customers
		double sum = 0;
		for (double element: sums) {
			sum += element;
		}
		double average = sum / sums.length;
		
		// Biggest Spender
		System.out.println("Biggest: " + names[i][0] + " " + names[i][1] + " " + "(" + max + ")");
		
		// Smallest Spender
		System.out.println("Smallest: " + names[j][0] + " " + names[j][1] + " " + "(" + min + ")");
	
		// Average amount spent by customers
		System.out.println("Average: " + average);
		
		scan.close();
	}
	
}
	
