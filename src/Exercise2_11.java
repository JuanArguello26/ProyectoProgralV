import java.util.Scanner;

public class Exercise2_11 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce a number to generate the table, please: ");

       int number;

       number= read.nextInt();

       for(int i=1; i<=10; i++){

           System.out.println(number+ " * " + i + " =" + (number*i));
       }

       read.close();

    }
}
