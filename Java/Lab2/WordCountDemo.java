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
   public static void main (String [] args){
   
      WordCount wordCount2 = new WordCount();
      
      int count = 0;
      Scanner input = new Scanner(System.in);
      String sentence = " ";
      sentence = getSentence ();
      String [] words = sentence.split(" ");
      
      for (int i = 0; i <= words.length (); i++){
         if (words[i][0].ignoreCase() == "a" && count> 0){
            wordCount2.decrementCounter(count);
         } else {
            wordCount2.incrementCounter(count);
         }
         
         System.out.println ("There are " + count + "words in this sentence.");
      }  
            
      
      
   
   
    
   
   
   
   }
   public static String getSentence (){
      System.out.print("Enter a sentence: ");
      sentence = input.next ();
      return sentence;  
   }  
}
