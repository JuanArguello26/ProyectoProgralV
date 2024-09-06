import java.util.Scanner;

public class Excercise2_13 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num, adddiv = 0, i=1;

        System.out.println("Hi, this is a test message");

        System.out.println("Please enter the first number that you want to verify");

        num= read.nextInt();

        if(num<=0){

            System.out.println("Error; the number has to be higher than zero.");

        }else{
            System.out.println("");

            do{

                if(num% i == 0){

                    adddiv +=i;

                    System.out.println("The dividers of: " + num + " are: " + i);
                }

                i++;

            }while (i <= num/2);

                System.out.println("");

                System.out.println("The result of the sum is: " + adddiv);


                if(adddiv == num){

                    System.out.println("");

                    System.out.println(num + " is a perfect number.");


            }else{

                    System.out.println("");

                    System.out.println(num + " isn't a perfect number.");

            }
        }




    }
}
