package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Set up while loops
		int x = 0;
		int y = 0;
		
		// Set up some variables and arrays outside the loops 
		double newtotal = 0;
		double[] newprices = new double[0];
		
		// Numerical data first
		int customers = scan.nextInt();
		
		// While loop; will exit when x is greater than the number of customers
		while (x<=customers)
		{
		
			// Customer first name
			String fname = scan.next();
		
			// Customer last name
			String lname = scan.next();
		
			// Number of unique items bought by customer
			int items = scan.nextInt();
		
			// 2nd while loop
			while (y<=items)
			{
		
				// Number of each item bought
				int count = scan.nextInt();
				
				// Name of each item
				String item = scan.next();
		
				// Price of items
				double price = scan.nextDouble();
		
				// Get the price of each item
				double total = count*price;
				
				newtotal = total;
				
				y++;
				
			}
			
			// Create new array for prices
			double[] prices = new double[items];
	
			// Enter values into array using for loop
			int i=0; 
			while (i>=0) {
				prices[i] = newtotal;
				i++;
		
			// Close scanner
			scan.close();
				
			}		
		newprices = prices;	
			
		// Summing values in array
		double sumprice = 0;
		for (double z: newprices) {
			sumprice += z;
		}
			
		// Converting double values to string values	
		String rsumprice = String.format("%.2f", sumprice);
		
		
		System.out.println(String.valueOf(fname.charAt(0)) + lname + rsumprice);
		
		x++;
		
		}
		
		
	}
}
