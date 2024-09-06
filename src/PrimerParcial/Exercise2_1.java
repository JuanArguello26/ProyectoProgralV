package PrimerParcial;

import java.util.Scanner;

public class Exercise2_1 {

    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);

        System.out.println("¿How many numbers do you want to add up?");

        int num = lec.nextInt();

        System.out.println("The result of the sum of the first " + num + " pairs is: " + sum(num));

        System.out.println("Finishing the code...");

    }

    public static int sum(int num){

        int res=0;
        int actualnum=1;
        int paircont=0;

        do{

            if(actualnum %2 == 0){

                res+= actualnum;
                paircont++;

                System.out.println(paircont + ":" + actualnum);
            }
            actualnum++;

        }while(paircont< num);

        return res;
    }
}
