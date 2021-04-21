public class GravityCalculator2 {
   public static void main (String [] args){
      double gravity = -9.81; // Earth's gravity in m/s^2
      double initialVelocity = 0.0;
      double fallingTime = 10.0;
      double initialPosition = 0.0;
      double finalPosition = 0.0;
      System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
      
      double position = (0.5*gravity*fallingTime*fallingTime)+initialVelocity*fallingTime+initialPosition;
      System.out.print("The object's position is ");
      System.out.printf("Value: %.2f", position);
   
   
   
   
   }
}