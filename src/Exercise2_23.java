import java.util.*;
public class Exercise2_23 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int random=(int)(Math.random()*100);

        Scanner read = new Scanner (System.in);

        int num=0;

        int tries=0;


        do {
            tries++;

            System.out.println("Introduce a number, please");

            num=read.nextInt();

            if(random < num) {

                System.out.println("Put a lower number");
            }

            else if(random >num) {

                System.out.println("Put a higher number");

            }
        }while(num!=random);

        System.out.println("Nice.\n You got it in: " + tries + " tries.");



    }

}