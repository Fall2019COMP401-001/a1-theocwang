package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Set up while loops
		int x = 0;
		int y = 0;
		double z = 0;
		
		// Numerical data first
		int customers = scan.nextInt();
		
		// While loop; will exit when x is greater than the number of customers
		while (x<customers)
		{
			y = 0;
			
			// Customer first name
			String fname = scan.next();
		
			// Customer last name
			String lname = scan.next();
		
			// Number of unique items bought by customer
			int items = scan.nextInt();
			
			z = 0;
		
			// 2nd while loop
			while (y<items)
			{
				
				// Number of each item bought
				int count = scan.nextInt();
				
				// Name of each item
				String item = scan.next();
		
				// Price of items
				double price = scan.nextDouble();
		
				// Get the price of each item
				double total = count*price;
				
				z += total;
				
				y++;
			}

			
		// Converting double values to string values	
		String rsumprice = String.format("%.2f", z);
		
		
		System.out.println(String.valueOf(fname.charAt(0))+"." + " " + lname + ":" + " " + rsumprice);
		
		x++;
		
		}
		scan.close();
	}
}
