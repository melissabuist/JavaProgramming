/*********************************************************************************
* Lab 2: <Modifying Lab>
*
* Description:
* <This program calculates the cost of catering per guests >
* 
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <February 8, 2019>
*
* Input: <number of guests>
* Output: <price and event boolean>
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
import java.util.Scanner;
public class JennyCateringWithMethods {
   public static int guests = 0;
   public static double totalBill = 0;
   public static Scanner enter = new Scanner(System.in);

   public static void main(String[] args) {
   
   
      
      guests = getGuests(guests);
      printSlogan();
      displayResults(guests, totalBill);
      
      
   
   }
   public static int getGuests (int guests){
      System.out.println("How many guests will be attending? ");
      guests = enter.nextInt();
      return guests;
   }
   public static void printSlogan (){
      System.out.println("**************************************************");
      System.out.println(" Jenny's Catering Service: Great Food, Good Price");
      System.out.println("**************************************************");
   }
   public static void displayResults (int guests, double totalBill){
      totalBill = guests * 35;
      System.out.println("Total Bill: $" + totalBill);
      boolean isLargeEvent = (guests > 49);
      //boolean isLargeEvent = (guests > Event.CUTOFF_VALUE_FOR_LARGE_GROUP);
      System.out.println("Is this a large event: " + isLargeEvent);
   
   
   
   
   }
   public static String getEventNumber (String eventNumber){
      System.out.println("What is the event number? ");
      JennyCateringWithMethods.enter.next();
      return eventNumber;  
    }
   


   

}