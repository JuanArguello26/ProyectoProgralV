import java.util.Scanner;

public class Exercise2_8 {
    public static void main(String[] args) {

        int n1,n2, max=0, i=0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please introduce the first number: ");

        n1=keyboard.nextInt();

        System.out.println("Introduce the second number: ");

        n2=keyboard.nextInt();

        max=n1;

        if(n2>max){

            max=n2;

            i=max;

            while ((i%n1!=0) || (i%n2!=0)){

                i++;
            }

            System.out.println("The MCM of " + n1 + " and " + n2 + " is: " + i);
        }

   }
}
