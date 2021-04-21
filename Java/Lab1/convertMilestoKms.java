/*********************************************************************************
* Lab 1: <Convert Miles to Kilometers>
*
* Description:
* <This asks the user for how many miles they want displayed and converts >
* <it to kilometers, outputing it in a table>
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <January 23, 2019>
*
* Input: <number of miles>
* Output: <a table of miles to kilometers>
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
import java.util.Scanner;
public class convertMilestoKms {
   public static void main (String [] args){
      //declares a class constant so kilos is changeable
      final double KILOS = 1.609;
      
      
      //asks the user for the number of miles they want   
      System.out.print("Which number of miles would you like to end the calculation? ");
      //constructs the Scanner
      Scanner input = new Scanner(System.in);
      //creates a variable to hold to user input
      int num = input.nextInt();
      //prints the table header
      System.out.println("Miles  Kilometers");
      //the for loop goes through and prints the table
      for (int i=1; i<=num; i++){
         //checks to make sure the spacing is right
         if (i < 10){
            System.out.println(i + "      " + i*KILOS);
         //adjusts the spacing if the user input is greater than 10
         }else{
            System.out.println(i + "     " + i*KILOS);
         }      
      }
   }
}
