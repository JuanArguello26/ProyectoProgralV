import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2_21 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the amount of numbers: ");
        int n = read.nextInt();

        List<Integer> num = new ArrayList<>();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            num.add(read.nextInt());
        }

        int positive = 0;
        int negative = 0;

        for (int numx : num) {
            if (numx > 0) {
                positive++;
            } else if (numx < 0) {
                negative++;
            }
        }

        System.out.println("Amount of positive numbers: " + positive);
        System.out.println("Amount of negative numbers: " + negative);

        read.close();
    }
}