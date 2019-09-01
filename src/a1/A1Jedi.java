package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemCount = scan.nextInt();

		// Scan the name and prices of each item in the store
		// First create an array for the name of the items
		// Also scan in the item prices
		String itemNameList[] = new String[itemCount];
		for (int x = 0; x < itemCount; x++) {
			itemNameList[x] = scan.next();
			scan.nextDouble();
		}

		// Scan the number of customers
		int customerCount = scan.nextInt();

		// Set up variables to count the number of each item and 
		// how many customers bought that item
		int a = 0;
		int z = 0;
		int index = 0;
		int buyingCustomerCount = 0;
		int buyingItemCount = 0;
		// First, create arrays for the customer and item counter
		int customerCountList[] = new int[itemNameList.length];
		int itemCountList[] = new int[itemNameList.length];
		int itemID[] = new int[itemNameList.length];
		while (a < customerCount) {
			scan.next();   // Scan the first name of each customer
			scan.next();   // Scan the last name of each customer
			// Scan the number of items each person has
			int buyingCount = scan.nextInt();
			// Another loop must be created for the items
			// Reset variable values for while loop
			z = 0;
			itemID[index] = 0;
			while (z < buyingCount) {
				buyingCustomerCount = 0;
				buyingItemCount = 0;
				int individualCount = scan.nextInt();
				String itemName = scan.next();
				index = Arrays.asList(itemNameList).indexOf(itemName);
				if (itemID[index] > 0) {
					buyingItemCount += individualCount;
					itemCountList[index] += buyingItemCount;
					z++;
				} else {
					buyingCustomerCount++;
					buyingItemCount += individualCount;
					customerCountList[index] += buyingCustomerCount;
					itemCountList[index] += buyingItemCount;
					itemID[index]++;
					z++;
				}
			}
			a++;
		}
		scan.close();
		
		for (int e = 0; e < itemNameList.length; e++) {
			if (customerCountList[e] == 0) {
				System.out.println("No customers bought " + itemNameList[e]);
		} else {
			System.out.println(customerCountList[e] + " customers bought " + itemCountList[e] + " " + itemNameList[e]);
		}
		}
	}
}
