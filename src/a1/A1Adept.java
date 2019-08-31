package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		// Scan the number of items in the store
		int itemCount = scan.nextInt();

		// Scan the name and prices of each item in the store
		// First create an array for the items
		String itemNameList[] = new String[itemCount];
		double itemPriceList[] = new double[itemCount];
		for (int x = 0; x < itemCount; x++) {
			itemNameList[x] = scan.next();
			itemPriceList[x] = scan.nextDouble();
		}

		// Scan the number of customers
		int customerCount = scan.nextInt();

		// For each customer, scan their names and the number
		// of items they have bought
		int a = 0;
		int z = 0;
		int w = 0;
		int index = -1;
		// First, create arrays for the customer's name and their price sums
		String customerFirstNameList[] = new String[customerCount];
		String customerLastNameList[] = new String[customerCount];
		double customerSumList[] = new double[customerCount];
		while (a < customerCount) {
			customerFirstNameList[a] = scan.next();
			customerLastNameList[a] = scan.next();
			// Scan the number of items each person has
			int buyingCount = scan.nextInt();
			// Another loop must be created for the items
			// Create an array for the customer's shopping trip price
			z = 0;
			w = 0;
			double totalPrice = 0;
			while (z < buyingCount) {
				int individualCount = scan.nextInt();
				String itemName = scan.next();
				index = Arrays.asList(itemNameList).indexOf(itemName);
				double total = individualCount * itemPriceList[index];
				totalPrice += total;
				z++;
			}
			while (w < buyingCount) {
				customerSumList[a] = totalPrice;
				w++;
			}
			a++;
		}
		scan.close();

		// Find the average amount spent by first finding the sum
		// of the money spent by all customers
		double sum = 0;
		for (double element : customerSumList) {
			sum += element;
		}

		// Now find the average by dividing by the number of customers
		double average = sum / customerSumList.length;

		// Find the minimum amount spent
		int minIndex = 0;
		double min = customerSumList[0];
		for (int i = 0; i < customerSumList.length; i++) {
			if (customerSumList[i] < min) {
				min = customerSumList[i];
				minIndex = i;
			}
		}

		// Find the maximum amount spent
		int maxIndex = 0;
		double max = customerSumList[0];
		for (int j = 0; j < customerSumList.length; j++) {
			if (customerSumList[j] > max) {
				max = customerSumList[j];
				maxIndex = j;
			}
		}
		
		// Biggest Spender
		System.out.println(
				"Biggest: " + customerFirstNameList[maxIndex] + " " + customerLastNameList[maxIndex] + " " + "(" + String.format("%.2f", max) + ")");

		// Smallest Spender
		System.out.println(
				"Smallest: " + customerFirstNameList[minIndex] + " " + customerLastNameList[minIndex] + " " + "(" + String.format("%.2f", min) + ")");

		// Average amount spent by customers
		System.out.println("Average: " + String.format("%.2f", average));
	}
}