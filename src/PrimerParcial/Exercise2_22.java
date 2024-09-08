package PrimerParcial;

import javax.swing.*;

public class Exercise2_22 {

    public static void main(String[] args) {

        int minor;
        int major;
        int amount;


        amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of numbers to evaluate: "));

        minor = 0;
        major = 0;


        for (int i=0; i < amount; i++) {
            int num= Integer.parseInt(JOptionPane.showInputDialog("Please enter another number: "+(i+1)));
            if (i==0) {
                minor = num;
                major = num;

            } else if (num<minor) {
                minor=num;
                
            }
            if(num>major) {
                major = num;
            }
        }




        JOptionPane.showMessageDialog(null, "The MAJOR number is: "+major+"  and the MINOR number is: "+minor);
    }
}