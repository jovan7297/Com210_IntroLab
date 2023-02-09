//Jovanni Lozzi
//Problem 1

package LabProblem1;

import javax.swing.JOptionPane;


public class LabProblem1 
{//Class Begins

    public static void main(String[] args) 
    {//Main Method Begins
     
        
            
    String item1 = JOptionPane.showInputDialog("Input the name of item 1");
    String s1 = JOptionPane.showInputDialog("What is the price of item 1");    
    Double price1 = Double.parseDouble(s1);
      
    String item2 = JOptionPane.showInputDialog("Input the name of item 2");
    s1 = JOptionPane.showInputDialog("What is the price of item 2");   
    Double price2 = Double.parseDouble(s1);
    
    String item3 = JOptionPane.showInputDialog("Input the name of item 3");
    s1 = JOptionPane.showInputDialog("What is the price of item 3");   
    Double price3 = Double.parseDouble(s1);
    
    System.out.println(item1+":"+price1);
    System.out.println(item2+":"+price2);
    System.out.println(item3+":"+price3);
    
    double average = (price1 +price2 + price3)/3;
    
    System.out.println("The average cost of the price is "+average);
    }//Main Method Ends  
}//Class Ends