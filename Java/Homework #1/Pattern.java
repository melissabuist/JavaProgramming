import java.util.Scanner;
public class hw1a {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
      
      //recieves the user's input
      System.out.print("How many lines would you like? ");
      int x = input.nextInt();
    
        int k = 0, count = 0, count1 = 0;

        for(int i = 1; i <= x; ++i) {
            for(int space = 1; space <= x - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while(k != 2 * i - 1) {
                if (count <= x - 1) {
                    System.out.print((i - k) + " ");
                    ++count;
                }
                else {
                    ++count1;
                    System.out.print((i - k + 2 * count1) + " ");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }
    }
}