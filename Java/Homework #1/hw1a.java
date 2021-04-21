import java.util.Scanner;
public class hw1a {

   public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
      //recieves the user's input
      System.out.print("How many lines would you like? ");
      int x = input.nextInt();
      //initializes and assigns some variables
      int k = 0;
      int count = 0;
      int count1 = 0;
      //prints the spaces 
      for(int i = 1; i <= x; i++) {
         for(int j = 1; j <= x - i; j++) {
            System.out.print("  ");
            ++count;
         }
         //prints the numbers in the pyramid
         while(k != 2 * i - 1) {
            if (count <= x - 1) {
               System.out.print((i - k) + " ");
               ++count;
            }
            else {
               ++count1;
               System.out.print((i - k + 2 * count1) + " ");
            }
         
            k++;
         }
         count1 = count = k = 0;
         //prints a new line 
         System.out.println();
      }
   }
}