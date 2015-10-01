/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dry;

/**
 * A stub class to share the correct interface for RetailItem
 */
public class RetailItem {
  private String description;
  private double price;
  private int unitsOnHand;

  public RetailItem(String description, int unitsOnHand, double price) {
	this.description = description;
	this.price = price;
	this.unitsOnHand = unitsOnHand;
  }

  public String getDescription() { return this.description; }

  public double getPrice() { return this.price; }

  public int getUnitsOnHand() { return this.unitsOnHand; }	  
}
