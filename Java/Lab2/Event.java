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

public class Event {

   // Two public final static fields that hold the price per guest ($35) and the event (50 guests)
   public final static double PRICE_PER_GUEST = 35.00;
   public final static int CUTOFF_VALUE_FOR_LARGE_GROUP = 50;

   // Three private fields that hold an event number, number of guests for the event, and the price.
   // The event number is stored as a String because Jenny plans to assign event numbers such as M312.
   // ??
   private String eventNumber;
   private int guests;
   private double price;
   

   public void setEventNumber(String eventNum2) {
      eventNumber = eventNum2;
   
   }

   public void setGuests(int initialGuests) {
      guests = initialGuests;
      price = initialGuests*PRICE_PER_GUEST;
   
   }

   // Three public get methods that return the values in the three nonstatic fields
   // ...
   public String getEventNumber (){
      return eventNumber;
   }
   public int getGuests(){
      return guests;
   }
   public double getPrice(){
      return price;
   }
}
