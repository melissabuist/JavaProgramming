import javax.swing.*;  
import java.awt.event.*;  
public class lab3 extends JFrame{  
    
   private JPanel panel;      // To reference a panel
   private JLabel label1, label2, label3; // To reference a label
   private JTextField textField1; // To reference a text field
   private JButton calcButton;   // To reference a button
   private final int WINDOW_WIDTH = 50;   // Window width
   private final int WINDOW_HEIGHT = 200;  //window height

   public lab3 () {  
      //set the window title
      setTitle("Calculate Tip");
      //set the size of the window
      setSize (WINDOW_WIDTH, WINDOW_HEIGHT);
      //specifiy what happens when the close button is clicked  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
      //build the panel and add it to the frame   
      buildPanel();
      add(panel);
      //display the window  
      setVisible(true);
   }

   /**
   The buildPanel method adds a label, text field, and
   and a button to a panel.
   */
      private void buildPanel() {
         //creates labels 
         label1 = new JLabel("Restaurant Charge:");
      
         label2 = new JLabel("         Amount to Tip:          ");
         
         label3 = new JLabel(" ");
      
         //create a text field
         textField1 = new JTextField(20);
         //makes the button
         calcButton = new JButton ("         Calculate Tip           ");
         //add an action listener to the button
         calcButton.addActionListener (new CalcButtonListener ());
         //create a JPanel object and let the panel field reference it
         panel = new JPanel ();
      
         //add the labels, text field, and button to the panel
         panel.add(label1);
         panel.add(textField1);
         panel.add(calcButton);
         panel.add(label2);
         panel.add(label3);
      
      
      
      
      }
     //this method executes when the user clicks the button  
    private class CalcButtonListener implements ActionListener {
    
      public void actionPerformed (ActionEvent e){ 
         //initializes a conversion variable, cost, and number for the tip amount
         final double CONVERSION = 0.15;
         String cost;
         double num;
         //gets the text from within the text field 
         cost = textField1.getText();
         
         //convert the input into the tip amount
         num = Double.parseDouble(cost) * CONVERSION;
         
         //sets the last label to be the tip amount
         label3.setText("$"+String.format("%.2f",num));
         
         
         
         
      
      }
   }  
      public static void main (String [] args){
         new lab3();
      }
   }  
   
