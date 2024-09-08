import java.util.Scanner;

public class Exercise2_6 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int a=0, b=1, c, d;

        System.out.print("Please introduce the number of items: ");

        d= keyboard.nextInt();

        for (int i=0; i< d; i++){

            System.out.println(a);

            c=a+b;

            a=b;

            b=c;

        }

        keyboard.close();
    }
}
