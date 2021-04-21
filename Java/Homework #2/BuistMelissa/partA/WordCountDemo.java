/*********************************************************************************
* Homework 2A: <Classes>
*
* Description:
* <This class changes the count of the int that will count the number of words>
* <in the sentence>
*
* Author: <Melissa L. Buist> <Melissa.Buist@mytwu.ca>
* Date: <February 8, 2019>
*
* Input: <a sentence >
* Output: <the number of words in a sentence>
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
import java.util.Scanner;
public class WordCountDemo {
   public static void main (String [] args) {
      //creates an instance of the wordCount object
      WordCount wordCount2 = new WordCount();
      
      int count = 0;
      //creates an new scanner
      Scanner input = new Scanner(System.in);
         //gets the sentence and splits it at the spaces into an array
      String sentence = getSentence (input);
      String [] words = sentence.split(" ");
      //parsing through the array and changes the counter
      for (int i = 0; i < words.length; i++){
         if (words[i].charAt(0) == 'a' || words[i].charAt(0) == 'A') {
            count = wordCount2.decrementCounter(count);
         } else {
            count = wordCount2.incrementCounter(count);
         }
         
         
      }
      //outputs the results 
      System.out.println ("There are " + count + " words in this sentence."); 
            
      
      
   
   
    
   
   
   
   }
   //gets the sentence from the user
   public static String getSentence (Scanner input){
      System.out.print("Enter a sentence: ");
      String sentence = input.nextLine();
      return sentence;  
   }  
}
