import java.util.Scanner;

public class Exercise2_24 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int numelements;

        int contofpairs = 0;

        int contofimpairs = 0;

        int iterator = 0;

        int value;

        System.out.println("Enter the number of items you want:");

        numelements = keyboard.nextInt();

        System.out.println(" ");

        while (iterator < numelements) {

            System.out.println("Enter the element number " + iterator + " :");

            value = keyboard.nextInt();

            if (value % 2 == 0) {

                contofpairs++;

            } else {

                contofimpairs++;
            }

            iterator++;
        }
        System.out.println("The number of even elements is: " + contofpairs);

        System.out.println("The number of odd elements is: " + contofimpairs);
    }}



