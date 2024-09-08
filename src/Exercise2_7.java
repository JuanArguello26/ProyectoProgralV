import java.util.Scanner;

public class Exercise2_7 {
    public static void main(String[] args) {

        Scanner keyboard= new Scanner(System.in);

        int n1,n2;

        System.out.println("Introduce the first number: ");

        n1=keyboard.nextInt();

        System.out.println("Introduce the second number");

        n2=keyboard.nextInt();

        while(n1!=n2)

            if(n1>n2){

                n1=n1-n2;
            }else{

                n2= n2-n1;
            }

        System.out.println("The MCD is: " + n1);

        keyboard.close();

    }
}
