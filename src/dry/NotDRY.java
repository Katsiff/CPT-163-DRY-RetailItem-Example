/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dry;

import java.util.Scanner;

public class NotDRY{

  public static void main() {
	// create objects
	Scanner keyboard = new Scanner(System.in);
	RetailItem item1;
	RetailItem item2;
	RetailItem item3;
	// variables needed
	String desc;                // description of item
	int units;                  // number of units of item
	double price;               // price per unit of item
	int option;                 // menu option entered

	// display heading and prompt user for make, year, and initial speed
	System.out.println("Testing the RetailItem Class\n");

	// set fields in each field of item1 class object
	System.out.print("Enter the description of a unit: ");
	desc = keyboard.nextLine();
	System.out.print("Enter the number of units: ");
	units = keyboard.nextInt();
	System.out.print("Enter the price per unit: $");
	price = keyboard.nextDouble();
	keyboard.nextLine();            // consume extra newline
	item1 = new RetailItem(desc, units, price);   // set fields
	System.out.println("\n");

	// set fields in each field of item2 class object
	System.out.print("Enter the description of a unit: ");
	desc = keyboard.nextLine();
	System.out.print("Enter the number of units: ");
	units = keyboard.nextInt();
	System.out.print("Enter the price per unit: $");
	price = keyboard.nextDouble();
	keyboard.nextLine();        // consume extra newline    
	item2 = new RetailItem(desc, units, price);   // set fields
	System.out.println("\n");

	// set fields in each field of item3 class object
	System.out.print("Enter the description of a unit: ");
	desc = keyboard.nextLine();
	System.out.print("Enter the number of units: ");
	units = keyboard.nextInt();
	System.out.print("Enter the price per unit: $");
	price = keyboard.nextDouble();
	keyboard.nextLine();        // consume extra newline
	item3 = new RetailItem(desc, units, price);   // set fields
	System.out.println("\n");

	// get & print values for item1 object
	System.out.println("Item #1");
	System.out.println("Item Description: " + item1.getDescription());
	System.out.printf("Item price: %.2f \n", item1.getPrice());
	System.out.printf("Number on hand: %d \n\n", item1.getUnitsOnHand());

	// get & print values for item2 object
	System.out.println("Item #2");
	System.out.println("Item Description: " + item2.getDescription());
	System.out.printf("Item price: %.2f \n", item2.getPrice());
	System.out.printf("Number on hand: %d \n\n", item2.getUnitsOnHand());

	// get & print values for item3 object
	System.out.println("Item #3");
	System.out.println("Item Description: " + item3.getDescription());
	System.out.printf("Item price: %.2f \n", item3.getPrice());
	System.out.printf("Number on hand: %d \n\n", item3.getUnitsOnHand());
  } //main

}
