import java.util.Scanner;

public class Exercise2_3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n1, i=1 , a=0;

        System.out.println("Introduce a number, please...");

        n1= read.nextInt();

        while (i <= n1){

            if(n1 % i ==0){

                a++;
            }
            i++;


        }

        if(a==2){

            System.out.println("The number: " + n1 + " it's prime. ");
        }else{

            System.out.println("The number: " + n1 + " isn't prime.");
        }

        read.close();

    }
}
