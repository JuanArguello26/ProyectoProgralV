import java.util.Scanner;

public class Exercise2_5 {

    static int n1;

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce a number");

        n1= read.nextInt();

        int n2=0;

        while(n1!=0){

            n2=n2*10+n1%10;

            n1/=10;

        }

        System.out.println("The inverse of the number would be: " + n2);

        read.close();

    }

}