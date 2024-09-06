import java.util.Scanner;

public class Exercise2_16 {

    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);

        System.out.println("Introduce a number: ");

        int n= read.nextInt();

        int d= Integer.toString(n).length();

        int t= 0;

        if(d>=5){

            for(int i=0; i<d; i++){

                String num= String.valueOf(Integer.toString(n).charAt(i));

                t+=Integer.parseInt(num);

            }

            System.out.println("The sum is: " + t);

            }else{

            System.out.println("Introduce a number with more digits.");

            }

        }


    }

