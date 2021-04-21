/*********************************************************************************
* Homework 4: <Inheritance and Polymorphism: IceCream Subclass>
*
* Description:
* <This class determines the cost of the icecream>
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
//extends the dessert item class to use inheritance 
public class IceCream extends DessertItem {
	private int cost;		// int for the cost of the icecream
	//this constructs the icecream method with the name and the cost being declared	
	public IceCream(String name, int cost) {
		super(name);
		this.cost = cost;
	}
	//this method gets the cost of the icecream
	public int getCost() {
		return cost;
	}
	
}