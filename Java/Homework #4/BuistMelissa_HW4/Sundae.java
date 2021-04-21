/*********************************************************************************
* Homework 4: <Inheritance and Polymorphism: Sundae Subclass>
*
* Description:
* <This class determines the cost of the icecream and the toppings in the sundae>
* 
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <March 21, 2019>
*
* Input: <NA>
* Output: <the cost of the items>
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
//this class extends ice cream since it inherits method from the ice cream class
public class Sundae extends IceCream {
	private String toppingType;   //string for the type of topping name
	private int toppingCost;		// int for topping cost in cents
	private int cost;             //int for the total cost of icecream and toppings
	
   //this method constructs the sundae and declares the topping type and cost
	public Sundae(String iceCreamName, int iceCreamCost, String toppingType, int toppingCost) {
		super(iceCreamName, iceCreamCost);
		this.toppingType = toppingType;
		this.toppingCost = toppingCost;		
	}
	//gets the cost of the ice cream and the toppings 
	public int getCost() {
		return this.toppingCost + super.getCost();
	}
	//gets the type of topping that the customer it buying
	public String getTopping() {
		return toppingType;
	}

}