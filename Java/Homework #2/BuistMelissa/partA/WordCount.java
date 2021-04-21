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
* Input: <nothing for the class>
* Output: <nothing for the class>
*
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any student.
*
* Sign here: <Melissa Buist>
********************************************************************************/
public class WordCount {

   private int count;
   //sets the counter
   public int setCounter (){
      count = 0;
      return count;
   } 
   //increments the counter
   public int incrementCounter (int count){
      count = count + 1;
      return count;
   }
   //decrements the counter
   public int decrementCounter (int count){
      count = count - 1;
      return count;
   }
   
   
   
}