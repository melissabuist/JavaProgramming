/*********************************************************************************
* Homework 4: <Inheritance and Polymorphism: Checkout Class>
*
* Description:
* <This class displays the check out reciept>
* 
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <March 21, 2019>
*
* Input: <NA>
* Output: <the reciept for the bought items>
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
public class Checkout {
   //declares some private variables
   private DessertItem[] DessertItems; //an array with dessert item class
   private int numberOfItems;  //an int for the number of items
   private final int RECEIPT_WIDTH = 30; //an int for the width of the receipt
	
   //this method declares an array of 100 to hold the items
   public Checkout() {
      DessertItems = new DessertItem[100];
      numberOfItems = 0;
   }
   
   //this method increments the number of items
   public void enterItem(DessertItem item) {
      this.DessertItems[numberOfItems] = item;
      numberOfItems++;
   }
   
   //this method clears the array if needed
   public void clear() {
      for(int i = 0; i < numberOfItems; i++){
         this.DessertItems[i] = null;
      }
      numberOfItems = 0;
   }
   
	//gets number of items
   public int numberOfItems() {
      return numberOfItems;
   }


	//this method calculates the total cost of the items
   public int totalCost() {
      int sum = 0;
      for(int i = 0; i < numberOfItems; i++){ 
         sum += DessertItems[i].getCost(); 
      }   
      return sum;
   }
	//this method calculates the tax on the total cost
   public int totalTax() {
      return (int)Math.round(this.totalCost() * DessertShoppe.TAX_RATE / 100.00);
   }
	//this method converts the items into a receipt
   public String toString() {
      String receipt = "";		//a string to hold all of the receipt
   	
   	
      receipt += "    " + DessertShoppe.STORE_NAME + "\n"; //prints the store name
      receipt += "    " + "--------------------" + "\n"; //prints the decorative line
   	
      for(int i = 0; i < numberOfItems; i++){ //this for loop goes through every item in the array
      
         String item = DessertItems[i].getName();		//item is a string to hold the name of the item in the i position of the array
      	      	
         String price = DessertShoppe.cents2dollarsAndCents(DessertItems[i].getCost());	//price holds the price of each item
         
         if (price.length() > DessertShoppe.COST_WIDTH){		// verifies the price is within length
            price = price.substring(0, DessertShoppe.COST_WIDTH);
      	}
         if (DessertItems[i] instanceof IceCream) {		// determines if the item is icecream
            //this while loop spaces out the name so that the prices all line up in the end
            while(item.length() < RECEIPT_WIDTH - price.length()){
               item += " ";
            }
            //adds the items to the receipt with a new line
            receipt += item + price + "\n";
         }
         else if (DessertItems[i] instanceof Sundae) {   //checks if the item is a sundae 
         	//adds the sundae and toppings to the receipt
            receipt += ((Sundae)DessertItems[i]).getTopping() + " Sundae with\n";
            //this while loop spaces out the name so that the prices all line up in the end
            while(item.length() < RECEIPT_WIDTH - price.length()){
               item += " ";
            }
            //adds the items and price to the receipt with a new line 
            receipt += item + price + "\n";
         }
         else if (DessertItems[i] instanceof Candy){		//checks if the item is candy
            //adds the item to the receipt with the weight since it is candy
            receipt += ((Candy) DessertItems[i]).getWeight() + " lbs @ " + DessertShoppe.cents2dollarsAndCents(((Candy) DessertItems[i]).getPricePerPound()) + " /lb.\n";
            //this while loop spaces out the name so that the prices all line up in the end
            while(item.length() < RECEIPT_WIDTH - price.length()){
               item += " ";
            }
            //adds the item to the receipt with a new line
            receipt += item + price + "\n";	
         }
         else {		//checks if the item is a cookie
            //adds the item to the receipt with price per dozen
            receipt += ((Cookie)DessertItems[i]).getNumber() + " @ " + DessertShoppe.cents2dollarsAndCents(((Cookie)DessertItems[i]).getPricePerDozen()) + " /dz\n";
                  
            //this while loop spaces out the name so that the prices all line up in the end
            while(item.length() < RECEIPT_WIDTH - price.length()){
               item += " ";
            }
            //adds the item and the price to the receipt
            receipt += item + price + "\n";			
         }	
      }
   	//line holds the word tax and adds it to a new line
      String line = "\nTax";	
      //converts the tax into dollars and cents	
      String tax = DessertShoppe.cents2dollarsAndCents(this.totalTax());	
      
      //this while loop spaces out the the tax cost so it all lines up nicely at the end
      while(line.length() <= RECEIPT_WIDTH - tax.length()){
         line += " ";
      }
      //adds the tax to the reciept
      receipt += line + tax;
   	//adds the total cost to the receipt
      String totalCost = DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax());	
      line = "\nTotal Cost";
      //this while loop spaces out the the total cost so it all lines up nicely at the end
      while(line.length() <= RECEIPT_WIDTH - totalCost.length()){
         line += " ";
      }
      //adds the total cost to the reciept
      receipt += line + totalCost;
      //returns the fully filled out receipt
      return receipt;
   }
}