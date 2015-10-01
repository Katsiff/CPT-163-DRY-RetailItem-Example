/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samuraipanzer
 */
public class DRYWithASideOfLoops {
  
  /**
   * Driver to show how this problem could be encapsulated in a loop.
   */
  public static void main(){
	Scanner keyboard = new Scanner(System.in);
	// We need some structure to store our data in. ArrayList is like and Array
	// but it does not have a fixed size so it grows as you add data.
	ArrayList<RetailItem> retailItemList = new ArrayList<RetailItem>();
	
	for(int i = 0; i < 3; i++) {
	  System.out.print("Enter the description of a unit: ");
	  String desc2 = keyboard.nextLine();
	  
	  System.out.print("Enter the number of units: ");
	  int units2 = keyboard.nextInt();
	  
	  System.out.print("Enter the price per unit: $");
	  double price2 = keyboard.nextDouble();
	  
	  keyboard.nextLine();        // consume extra newline
	  
	  // the add method on an ArrayList inserts an object at the next index of 
	  // the array.
	  retailItemList.add(new RetailItem(desc2, units2, price2));
	  
	  System.out.println("\n");
	}
	
	for(int i = 0; i<3; i++){
	  System.out.println("Item #" + (i+1));
	  System.out.println("Item Description: " + retailItemList.get(i).getDescription());
	  System.out.printf("Item price: %.2f \n", retailItemList.get(i).getPrice());
	  System.out.printf("Number on hand: %d \n\n", retailItemList.get(i).getUnitsOnHand());
	}
  }
}
