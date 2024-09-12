import java.util.Scanner;

public class Exercise2_25 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String prhase = read.nextLine();

        int numofwords = countp(prhase);

        System.out.println("The phrase has " + numofwords + " words.");

        read.close();
    }

    public static int countp(String frase) {

        String[] words = frase.split("\\s+");

        return words.length;
    }
    }

