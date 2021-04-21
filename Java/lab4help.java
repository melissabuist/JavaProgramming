import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class lab4help extends JPanel {
   public static void main (String [] args){
      JFrame frame = new JFrame("Push Counter");
      frame.setSize(300, 40);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      
   
      //PushCounterPanel panel = new PushCounterPanel();
      frame.pack();
      frame.setVisible(true);
      push = new JButton("Push Me!");
      push.addActionListener(new ButtonListener());
      add(push);
      add(label);
      setBackground(Color.cyan);
    
   
   }
}