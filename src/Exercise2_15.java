import java.util.Scanner;

public class Exercise2_15 {

    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);

        int limit;

        System.out.println("¿How many numbers armstrong do you want to know:?");

        limit=read.nextInt();

        for(int yorn = 0; yorn < limit; yorn++){ //yorn means Yes or not.

            if(isArmstrong(yorn) == true){

                System.out.println( yorn+ "¡It's armstrong!");
            }

        }

    }

    static boolean isArmstrong(int yorn){

        int sum=0, dig = 0, aux = yorn;

        String amount= Integer.toString(yorn);

        while(yorn>0){

            dig=yorn % 10;

            sum+=Math.pow(dig, amount.length());

            yorn /= 10;


        }
        return sum == aux;
    }
}
