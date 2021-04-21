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
public class EventDemo {
      

   public static void main(String[] args) {
      
      String eventNum2 = " ";
      String eventNumber = " ";
      int newGuests = 0;
      JennyCateringWithMethods.getEventNumber(eventNumber);    
      JennyCateringWithMethods.printSlogan();      
      Event event = new Event (); 
      event.setEventNumber(eventNum2);
      event.setGuests(newGuests);
      JennyCateringWithMethods.displayResults();
      
      
      
   
   }
   
   



 

}
