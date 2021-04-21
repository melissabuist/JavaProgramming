/*********************************************************************************
* Homework 4: <Inheritance and Polymorphism: Cookie Subclass>
*
* Description:
* <This class determines the cost based on dozens>
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
//extends the dessert item class to show inheritance and share methods
public class Cookie extends DessertItem {
	private int num;      //int num for number of cookies
	private int price;	//int for price of cookies in cents
	private int cost;    //int cost for the cost of the cookies
	//this method declares the variables
	public Cookie(String name, int num, int price) {
		super(name);
		this.num = num;
		this.price = price;
	}
	//calculates the cost and rounds it depending on how many cookies they bought
	public int getCost() {
		cost = (int)Math.round(num / 12.0 * price);
		return cost;
	}
   //gets the number of cookies
	public int getNumber() {
		return num;
	}
   //gets the price per dozen
	public int getPricePerDozen() {
		return price;
	}
	
}