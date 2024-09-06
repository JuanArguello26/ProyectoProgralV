import javax.swing.*;

public class Exercise2_17 {

    public static void main(String[] args) {

        int n1,n2,n3;

        n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce a number:"));

        n2= Integer.parseInt(JOptionPane.showInputDialog("Introduce a number:"));

        n3= Integer.parseInt(JOptionPane.showInputDialog("Introduce a number:"));

        if((n1>n2) && (n2>n3)){

            JOptionPane.showMessageDialog(null, "The order is: " + n1 + " - " + n2 + " - " + n3);
            
        } else if ((n1>n3) && (n3>n2)) {

            JOptionPane.showMessageDialog(null, "The order is: " + n1 + " - " + n3 + " - " + n2);

        } else if ((n2>n1) && (n2>n3)) {

            JOptionPane.showMessageDialog(null, "The order is: " + n2 + " - " + n1 + " - " + n3);


        } else if ((n2>n3) && (n3>n1)) {

            JOptionPane.showMessageDialog(null, "The order is: " + n2 + " - " + n3 + " - " + n1);


        } else if ((n3>n1) && (n1>n2)) {

            JOptionPane.showMessageDialog(null, "The order is: " + n3 + " - " + n1 + " - " + n2);


        }else {

            JOptionPane.showMessageDialog(null, "The order is: " + n3 + " - " + n2 + " - " + n1);

        }

    }
}
