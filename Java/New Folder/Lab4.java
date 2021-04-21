/*********************************************************************************
* Lab 4: <ArrayList>
*
* Description:
* <This program takes scores for a dive from seven judges and outputs the min, max>
* <and final scores.>
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <March 26, 2019>
*
* Input: <the difficulty level and the scores>
* Output: <the final calculated scores>
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
//imports the class for arraylist and scanner
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab4 {
   public static void main (String [] args){
      //makes an array list for the scores
      ArrayList<Double> list = new ArrayList<Double>(7);
      //constructs a scanner for user input
      Scanner input = new Scanner (System.in);
      //retrieves the difficulty from the user
      System.out.print("Please enter the difficulty of the dive: ");
      double difficulty = Double.parseDouble(input.next());
      if (difficulty > 3.8){
         System.out.println ("Your difficulty is too large, please try again.");
         System.exit(0);
      } else if (difficulty < 1.2){
         System.out.println ("Your difficulty is too small, please try again.");
         System.exit(0);
      }
      //recieves the scores from the user and added them to the arraylist
      System.out.println("Please enter the scores from the seven judges:");
      for (int i = 1; i <= 7; i++){
         System.out.print("Score "+ i +": ");
         double score = (Double.parseDouble(input.next()));
         list.add(score);
         if (score < 0){
            System.out.println ("Your score is too small, please enter a number between 0 and 10");
            System.exit(0);
         }else if (score > 10){
            System.out.println ("Your score is too large, please enter a number between 0 and 10");
            System.exit(0);
         }
         
      }
      //calls to the methods
      list = findMaxAndMin (list);
      getScore (list, difficulty);
     
   }
   public static ArrayList<Double> findMaxAndMin (ArrayList<Double> list){
      //initializes variables to redefine later
      double min = 11;
      double max = 0; 
      int indexMin = 0;    
      int indexMax = 0;
      DecimalFormat f = new DecimalFormat("##.00");
      //a for loop to parse through the arraylist
      for (int i = 0; i < 7; i++){
         //gets the element at index i from the arraylist
         double score = list.get(i);
         //checks if the score is less then the min and redeclares the min 
         if (score < min){
            min = score;
            indexMin = i;
         }
         //checks if the score is more then the max and redeclares the max 
      
      }
      for (int j = 0; j < list.size(); j++){
         double score = list.get(j);
         if (score > max){
            max = score;
            indexMax = j;
         }
       
      }
      list.remove(indexMax);
       //removes the max and the min from the arraylist
      list.remove(indexMin);
       //prints out the results of min and max
      System.out.println ("Low ("+ f.format(min) +") and High (" + f.format(max) +") Scores Dropped.");
       //return the array list
      return list;
         
      
   }
   public static void getScore (ArrayList<Double> list, double difficulty){
         //initializes some variables
      double rawScore = 0;
      int size = list.size();
         //parses through the array list
      for (int i = 0; i < size; i++){
            //gets the scores and adds them all up to get the raw score
         rawScore = rawScore + list.get(i);   
      }
      
     DecimalFormat f = new DecimalFormat("##.00");
         //outputs the results of finding the scores
      System.out.println ("Raw Score = "+ f.format(rawScore));
      System.out.println ("Raw Score (" +f.format(rawScore)+") x Degree of Difficulty (" + f.format(difficulty) + ")");
         //calculates the final score by multiplying it with the difficulty of the dive
      double finalScore = rawScore * difficulty*0.6;
      System.out.println ("Total Score for the Dive = " + f.format(finalScore));
      
      
   }
   
   
   
   
}
