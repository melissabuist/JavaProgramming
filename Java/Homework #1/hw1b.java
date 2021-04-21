/*********************************************************************************
* Homework 1B: <Flow of Control>
*
* Description:
* <This program takes numbers from the user and determines the sum, postives and>
* <negatives and the average.>
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <January 24, 2019>
*
* Input: <numbers from the user>
* Output: <sum, positives, negatives, and the average>
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
import java.util.Scanner;
public class hw1b {
   public static void main (String [] args) {
      //defines a bunch of variables
      int num = 10;
      int positiveNum = 0;
      int negativeNum = 0;
      int totalNums = 0;
      double sum = 0.0;
      
      //the do while allows for multiple integers being enters
      do {
         //asks the user for the input of an int
         System.out.print("Enter a single integer, the input ends if it is 0: ");
         Scanner input = new Scanner(System.in);
         num = input.nextInt();
         
         //evaluates if the int is positive or negative and increments the variables
         if (num > 0) {
            positiveNum ++;
         }else if (num < 0){
            negativeNum ++;
         //evaluates if the inupt is only 0 
         }else if (totalNums == 0 && num ==0){
            System.out.println("No numbers are entered except 0");
         }
         //increments the sum and the count of times through the while loop
         sum = sum + num;
         totalNums++;
         
      }while (num != 0);
      
      //outputs the results and computes the average of the numbers 
      System.out.println("The number of positives is " + positiveNum);
      System.out.println("The number of negatives is " + negativeNum);
      System.out.println("The total is " + sum);
      double average = sum/(totalNums-1);
      System.out.println("The average is " + average); 
       
       
         
   
   
   }
}
 
