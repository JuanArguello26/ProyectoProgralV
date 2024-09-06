import javax.swing.*;

public class Exercise2_18 {

    public static void main(String[] args) {

        int num, elem=0, sum=0;

        float mid;

        num= Integer.parseInt(JOptionPane.showInputDialog("Introduce a number: "));

        while (num>=0){

            sum+=num;

            elem++;

            num= Integer.parseInt(JOptionPane.showInputDialog("Introduce another number: "));
        }

        if (elem== 0){

            System.out.println("Division by zeros doesn't exist.");
        }else{

            mid=(float)sum/elem;

            System.out.println("The average is: " + mid);
        }
    }
}
