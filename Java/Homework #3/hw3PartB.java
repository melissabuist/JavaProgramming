/*********************************************************************************
* Homework 3B: <Arrays>
*
* Description:
* <This program allows a user to choose a seat on an airplane and outputs  >
* <the seats available>
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <February 28, 2019>
*
* Input: <user's choice of seat>
* Output: <the display of the seats available on the plane>
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
//import scanner for user input 
import java.util.Scanner;
public class hw3PartB {
   public static void main (String [] args){
   
      //calls a method that makes the original empty plane array   
      String [][] array1 = makeArray();
      
      //constructs a new scanner called input
      Scanner input = new Scanner(System.in);
      
      //prompting the user to see if they want a seat      
      System.out.print ("Would you like to choose a seat? Y or N ");
      
      //gets the users reply     
      String answer = input.next();
      
      //a line just to make the output look nicer
      System.out.println ("~~~~~~~");
      
      //initializes a count to make sure it stops when the plane is full 
      int count = 0;
      
      //runs through the loop until the user doesn't want another plane seat or the plane is full
      while (answer.equals("Y") && count < 28){
         //prints the first unedited array 
         printArray (array1);
         //a line to make the output look nicer
         System.out.println ("~~~~~~~");
         //tells the user what the output means
         System.out.println ("If the seat space has an X in it, then the seat has been taken.");
         //asks the user for what seat they want and prompts them to reply
         System.out.print("What seat would you like? Please enter row number and letter. ");
         //collects the users requested seat
         String seat = input.next();
         //seperates the user's seat choice into two seperate variables - letter and number        
         String letter = seat.charAt(1)+"";
         String number = seat.charAt(0) + "";
         //calls the method to update the array for the seat choice
         updateArray (letter, number, array1);
         //a line to make the output look nicer
         System.out.println();
         //checks if the plane is full or not
         if (count < 28){
            //prompts the user if they want another seat
            System.out.print ("Would you like to choose another seat? Y or N ");
            //collects the user's reply
            answer = input.next();
         }else{
            //tells the user if the plane is full
            System.out.println ("All the seats are full.");
         
         }
         //updates the count to ensure the plane doesn't get full
         count++;
      
      } 
   }
   
   public static String [][] makeArray (){
      //initializes the first array and returns it to the main
      String [][] array1 = {{"1","A","B","C","D"},{"2","A","B","C","D"},{"3","A","B","C","D"},{"4","A","B","C","D"},{"5","A","B","C","D"},{"6","A","B","C","D"},{"7","A","B","C","D"}};
      return array1;
   
   }
   public static void printArray (String [][] array1){
      //parses through the array and prints it one element at a time so the output is right
      for (int rows = 0; rows < 7; rows++){
         for (int cols = 0; cols < 5; cols++){
            System.out.print((array1[rows][cols])+" ");
         }
         System.out.println();
      }
   
   }
   public static void updateArray (String letter, String number, String [][] array1){
      //initializes a new array to update
      String [][] newArray = array1;
      //num2 is the number of the row from the plane and it gets subracted one since an array is indexed at 0
      int num2 = Integer.parseInt(number) - 1;
      //prints a blank line to make the output prettier
      System.out.println();
   
      int num1 = 0;
      //determines what position the letter is at in the plane and updates and prints the array with an X
      if (letter.equals("A")){
         //changes the element at the position of the user's choice to an X
         newArray[num2][1] = "X";
         //prints the new array
         printArray (newArray);
      }else if (letter.equals("B")){
         newArray[num2][2] = "X";
         printArray (newArray);
      }else if (letter.equals("C")){
         newArray[num2][3] = "X";
         printArray (newArray);
      }else if (letter.equals("D")){
         newArray[num2][4] = "X";
         printArray (newArray);
      }else{
         System.out.println ("Not a valid seat.");
         
      } 
   }
}