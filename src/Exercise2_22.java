import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2_22 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the amount of numbers: ");
        int n = read.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(read.nextInt());
        }

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("The biggest number is: " + max);
        System.out.println("The lower number is: " + min);

        read.close();
    }
}