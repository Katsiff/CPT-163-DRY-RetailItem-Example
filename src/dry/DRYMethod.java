/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dry;

import java.util.Scanner;

/**
 * This encapsulates the input gathering and printing into methods
 * 
 */
public class DRYMethod {

  /**
   * Driver to show what the implementation of these two methods would look like
   */
  public static void main() {
	Scanner keyboard = new Scanner(System.in);

	RetailItem item1 = buildItem(keyboard);
	RetailItem item2 = buildItem(keyboard);
	RetailItem item3 = buildItem(keyboard);
	
	printItemInfo(item1);
	printItemInfo(item2);
	printItemInfo(item3);
  }

  /**
   * Constructs a RetailItem instance from user input
   * @param keyboard - A Scanner object to provide values for the generation of
   * Retail Item
   * @return RetailItem instance constructed with user input
   */
  public static RetailItem buildItem(Scanner keyboard) {
	// set fields in each field of item1 class object
	System.out.print("Enter the description of a unit: ");
	String desc = keyboard.nextLine();
	System.out.print("Enter the number of units: ");
	int units = keyboard.nextInt();
	System.out.print("Enter the price per unit: $");
	double price = keyboard.nextDouble();
	keyboard.nextLine();            // consume extra newline

	//item1.RetailItem(desc, units, price);   // set fields
	System.out.println("\n");
	RetailItem item = new RetailItem(desc, units, price);
	return item;
  }

  /**
   * Accepts and prints details about a RetailItemInstance
   * @param item RetailItem
   */
  public static void printItemInfo(RetailItem item) {
	System.out.println("Item Description: " + item.getDescription());
	System.out.printf("Item price: %.2f \n", item.getPrice());
	System.out.printf("Number on hand: %d \n\n", item.getUnitsOnHand());
  }
}
