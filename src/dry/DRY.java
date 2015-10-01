/**
 * Main Driver with a menu to allow you to try out each style of abstraction
 */
package dry;

import java.util.Scanner;

public class DRY {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Choose 1. To Run DRY With Loops\n" +
					   "2. To Run DRY With Methods\n" +
					   "3. To Run Original Program\n");
	int choice = keyboard.nextInt();
	
	switch(choice){
	  case 1:
		DRYWithASideOfLoops.main();
		break;
	  case 2:
		DRYMethod.main();
		break;
	  case 3:
		NotDRY.main();
		break;
	  default:
	}
  }
}
