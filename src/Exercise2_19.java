import java.util.Scanner;

public class Exercise2_19 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        float celsius, farenheit;

        System.out.println("Enter the degrees Celsius: ");

        celsius= read.nextFloat();

        farenheit=(celsius* 9/5) + 32;

        System.out.println(celsius + " degrees Celsius converted to degrees Fahrenheit is: " + farenheit);



    }
}
