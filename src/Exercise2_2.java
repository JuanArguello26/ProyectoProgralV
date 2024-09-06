import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise2_2 {

    static int n1;

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce a number");

        n1= read.nextInt();

        if(n1 < 0){

            System.out.println("The factorial couldn't be calculated");
        }else{

            operation();
        }

    }

    public static void  operation(){

        int i, f= 1;

        for(i=1; i<= n1; i++){

            f=f*i;


        }
        System.out.println("The factorial of: " + n1 + " is: " + f );
    }
}
