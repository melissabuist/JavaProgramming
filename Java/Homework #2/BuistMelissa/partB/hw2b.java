/*********************************************************************************
* Homework 2A: <Classes>
*
* Description:
* <This program finds the average of a rating from a file>
* 
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <February 8, 2019>
*
* Input: <file name>
* Output:< the average rating >
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
//importing the stuff for files, scanner, and stringtokenizer
import java.util.Scanner;   
import java.io.FileInputStream;    
import java.io.FileNotFoundException; 
import java.util.StringTokenizer;
 
public class hw2b {
   public static void main (String [] args){
      //constructs the scanner for the file and user input
      Scanner inputStream = null;
      Scanner input = new Scanner(System.in);
   
      String fileName = getFileName (input);
   
   
      try           { 
         //gets the file 
         inputStream =  new Scanner(new FileInputStream(fileName)); 
      } 
      //throws the exception if the file isn't found
      catch (FileNotFoundException e)         {
         System.out.println("File " + fileName +" was not found or could not be opened."); 
         System.exit(0); 
      } 
      //calls the first line which is letters
      inputStream.nextLine ();
      //declaring a ton of variables to 0
      int countA = 0;
      int countB = 0;
      int countC = 0;
      int countD = 0;
      int countE = 0;
      int countA2 = 0;
      int countB2 = 0;
      int countC2 = 0;
      int countD2 = 0;
      int countE2 = 0;
      int counterA = 0;
      int counterB = 0;
      int counterC = 0;
      int counterD = 0;
      int counterE = 0;
   
      //declares the delimiter to split the file line
      String delimiters = ", "; //Comma and blank space 
      //parses through the file line by line      
      while (inputStream.hasNextLine()){
         //split the line at the comma
         String line = inputStream.nextLine();
         StringTokenizer nameFactory = new StringTokenizer(line, delimiters); 
    
         //declares the tokens of the lines as letter counts
         countA = Integer.parseInt(nameFactory.nextToken()); 
         countB = Integer.parseInt(nameFactory.nextToken());
         countC = Integer.parseInt(nameFactory.nextToken());
         countD = Integer.parseInt(nameFactory.nextToken());
         countE = Integer.parseInt(nameFactory.nextToken());
         //doesn't increment the counter if the customer doesn't rate it 
         if (countA == 0){
            counterA = counterA;
         }else{
            counterA = counterA + 1;
         }   
         if (countB == 0){
            counterB = counterB;
            
         }else{
            counterB = counterB + 1;
         }   
         if (countC == 0){
            counterC = counterC;
         }else{
            counterC = counterC + 1;
         }   
      
         if (countD == 0){
            counterD = counterD;
         }else{
            counterD = counterD + 1;
         }   
      
         if (countE == 0){
            counterE = counterE;
         
         }else{
            counterE = counterE + 1;          
         }
         //starts counting up the total of the sections
         countA2 = countA +  countA2;
         countB2 = countB + countB2;
         countC2 = countC +  countC2;
         countD2 = countD + countD2;
         countE2 = countE + countE2;

      }
      //calculates the average of the ratings
      double averageA = ((countA2+0.0)/counterA);
      double averageB = ((countB2+0.0)/counterB) ;
      double averageC = ((countC2+0.0)/counterC) ;
      double averageD = ((countD2+0.0)/counterD);
      double averageE = ((countE2+0.0)/counterE);
      
      //outputs the results 
      System.out.println("The average rating for A is " + averageA);
      System.out.println("The average rating for B is " + averageB);
      System.out.println("The average rating for C is " + averageC);
      System.out.println("The average rating for D is " + averageD);
      System.out.println("The average rating for E is " + averageE);
   
      
   
   
   
   
   
   
   
   }
   //asks the user for the file name
   
   public static String getFileName (Scanner input){
      System.out.print("What file do you want to read? ");
      String fileName = input.next(); 
      return fileName;
   }
}