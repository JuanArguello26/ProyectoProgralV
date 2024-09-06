import java.util.Locale;
import java.util.Scanner;

public class Exercise2_9 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String word;

        char[] palindrome;

        int left,right;

        System.out.println("Introduce the word: ");

        word= read.nextLine();

        word=word.toLowerCase();

        word=word.replace(" ","");

        palindrome= word.toCharArray();

        left= 0;

        right= palindrome.length-1;

        while (left < right){

            if (palindrome[left] == palindrome[right]){

                right --;
                left ++;
            }else{
                System.out.println("The word isn't a palindrome, finishing the code.");
                break;
            }

        }

        if (left== right){

            System.out.println("The word is a palindrome, finishing the code.");
        }

    }
}
