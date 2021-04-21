/*********************************************************************************
* Homework 4: <Inheritance and Polymorphism: Candy Subclass>
*
* Description:
* <This class determines the cost based on weight>
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
//extends DessertItem to show the inheritance
public class Candy extends DessertItem {
	private double weight; //double for the weight of the candy
	private int price;	//int for the price per pound in cents
	private int cost; //cost of the candy bought
   
	//this method declares the variables
	public Candy(String name, double weight, int price) {
		super(name);
		this.price = price;
		this.weight = weight;
	}
	//gets the cost of the candy and rounds it
	public int getCost() {
		this.cost = (int)Math.round(this.weight * this.price);
		return cost;
	}
	//get the price 
	public int getPricePerPound() {
		return price;
	}
	//gets the weight
	public double getWeight() {
		return weight;
	}
}