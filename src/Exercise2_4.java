import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercise2_4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String string1;

        int count= 0, i;

        char letter;

        System.out.println("Please enter a prhase ");

        string1= read.nextLine();

        for (i=0; i< string1.length(); i++){

           letter=  Character.toLowerCase(string1.charAt(i));

           if(letter== 'a' || letter== 'e' || letter== 'i' || letter== 'o' || letter== 'u'){

               count++;
           }

        }

        System.out.println("The number of vowels is: " + count);

        read.close();

    }
}
