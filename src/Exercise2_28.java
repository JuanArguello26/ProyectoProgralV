import java.util.Scanner;

public class Exercise2_28 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String cuantity;

        int count= 0, i;

        int digits;

        System.out.println("Please enter a large number ");

        cuantity= read.nextLine();

        for (i=0; i< cuantity.length(); i++){

            digits=  Character.toLowerCase(cuantity.charAt(i));

            if(digits>0){

                count++;
            }

        }

        System.out.println("The number of digits is: " + count);

        read.close();

    }
}
