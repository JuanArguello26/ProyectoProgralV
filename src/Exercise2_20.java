import java.util.Scanner;

public class Exercise2_20 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num, sum=0;

        num=1;

        while (num !=0 ){

            System.out.println("Enter a number: ");

            num= read.nextInt();

            sum += num;

        }

        System.out.println("The sum of the numbers is: " + sum);

        read.close();
    }
}
