/*********************************************************************************
* Homework 3A: <Arrays>
*
* Description:
* <This program plays a memory game with the user.>
* 
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <February 28, 2019>
*
* Input: <user's input of card position>
* Output: <the display of the game board >
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
//import scanner for user input and random for shuffling the game board
import java.util.Scanner;
import java.util.Random;

public class hw3PartA {
   public static void main (String [] args){
      //displays an intro to the game
      System.out.println("You are now playing a memory matching game. Your goal is to find matches");
      System.out.println("within the game board and they will stay face up.");
      System.out.println();
      //constructs a new scanner for user input
      Scanner input = new Scanner (System.in);
      //calls a method to make a new array
      String [][] array1 = makeArray ();
      //print the array to show the blank game board
      printArray (array1);
      //calls a method to make an array to have the game board with the numbers mixed randomly
      int [][] ansArray = shuffle();
      //initializing a count to make the game end when the board is completely guessed
      int count = 0;
      //a while loop to make guesses until the game is finished
      while (count < 17){
         //a line for a better looking output
         System.out.println();
         //prompts the users to enter two guesses
         System.out.println("Please enter the coordinates of the card you would like to see as two numbers seperated by a comma");
         System.out.print("Guess 1: ");
         String guess1 = input.nextLine();
         System.out.print("Guess 2: ");
         String guess2 = input.nextLine();
         
         //passes the guesses to a method to determine what the numbers are at the given location and if they are the same
         boolean coordinate = findCoordinate (guess1, guess2, ansArray, array1);
         //tests if the numbers where matching in the given coordinates
         if (coordinate == true){
            //outputs a nice statement and increments the count
            System.out.println("Good Guess! You found a match");
            count = count + 2;
         }else{
            //outputs a number of lines in order to hide the results of the wrong guess
            System.out.println();
            System.out.print("You didn't find a match :( try again");
            System.out.println ();
            System.out.println ();
            System.out.println ();
            System.out.println ();
            System.out.println ();
            printArray(array1);
         }
            
      }
      System.out.println("Congrats! You have finished the game!");
   
   
   
   
   
   }
   public static String [][] makeArray (){
      //creates the empty game board array
      String [][] array1 = {{" ","1","2","3","4"},{"1","*","*","*","*"},{"2","*","*","*","*"},{"3","*","*","*","*"},{"4","*","*","*","*"}};
      return array1;
   }
   
   public static void printArray (String [][] array1){
      //prints the array element by element
      for (int rows = 0; rows < 5; rows++){
         for (int cols = 0; cols < 5; cols++){
            System.out.print((array1[rows][cols])+" ");
         }
         System.out.println();
      }
   
   }
   
   public static int [][] shuffle (){
      //creates an instance of a random for later
      Random rand = new Random();
      //creates to counts for later
      int count = 1;
      int count2 = 0;
      //makes a 4x4 array full of zereos to be filled in later
      int [][] ansArray = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
      
      
      //only places the first set of 8 numbers         
      for (int i = 1; i<= 8; i++){
         //creates two randoms that output numbers 0 - 3
         int num1 = rand.nextInt(3);
         int num2 = rand.nextInt(3);
         //checks if the position if the random is 'empty' or with a zero
         if (ansArray[num1][num2] == 0) { 
            ansArray[num1][num2] = i;
         //if not, the last row in the array is saved for if the random cooridinate is full
         }else{
            ansArray[3][count2]=i;
            count2++;
            
         }
            
      }
      //these for loops check which positions in the array are 'empty' and fills them starting with 1
      for (int rows = 0; rows < 4; rows++){
         for (int cols = 0; cols < 4; cols++){
            if (ansArray[rows][cols] == 0){
               ansArray[rows][cols] = count;
               count++;
            }
             
         
         }
      }
      
      //returns the ansArray to make it accessible in the main
      return ansArray;
      
   } 
   
   public static boolean findCoordinate (String guess1, String guess2, int[][] ansArray, String [][] array1){
      //converts the first guess into to seperate string - row and column coordinates
      String num1 = guess1.charAt(0) +"";
      String num2 = guess1.charAt(2) +"";
      //convers the second guess into to seperate string - row and column coordinates
      String num3 = guess2.charAt(0) +"";
      String num4 = guess2.charAt(2) +"";
      //converts the guess into ints     
      int rows = Integer.parseInt(num1) - 1;
      int cols = Integer.parseInt(num2) - 1;
      int rows2 = Integer.parseInt(num3) - 1;
      int cols2 = Integer.parseInt(num4) - 1;
      //checks the numbers in the answer array at the position guessed
      int number1 = ansArray[rows][cols];
      int number2 = ansArray[rows2][cols2];
      //changes the game board array into the numbers behind the guessed coordinates
      array1[rows+1][cols+1] = number1 +"";
      array1[rows2+1][cols2+1] = number2 + "";
      //prints the array with the guesses displayed
      printArray(array1);
      //returns true if the two numbers matched
      if (number1 == number2){
         return true;
      }else{
         //if they don't match, it'll replace the guessed coordinate with a little star again 
         array1[rows+1][cols+1] = "*";
         array1[rows2+1][cols2+1] = "*";
         return false;
      }
      
   }
   
}
