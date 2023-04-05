/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture10_bills;
import javax.swing.*;


public class Lecture10_Bills {

    
    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Enter the customers name");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the minutes talked"));
         double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per minute"));
         
         
         //send variables to constuctors bill class
         bill b = new bill(strName, dblMinutesTalked, dblCostPerMinute);
         
         JOptionPane.showMessageDialog(null , "Customer NAME: "
                 + b.getName().toUpperCase() + "\n" 
         + "Total Due: R " + b.getTotalBills());
        
        
    }
    
}
