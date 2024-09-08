import java.util.Scanner;

public class AdvancedExercise1 {
    public static void main(String[] args) {
        Scanner read  = new Scanner(System.in);

        System.out.print("Introduce the number of transactions for the day: ");
        int numtrade = read.nextInt();

        double totalsales = 0;
        double highersale = Double.MIN_VALUE;
        double lowersale = Double.MAX_VALUE;

        for (int i = 1; i <= numtrade; i++) {
            System.out.print("Enter the transaction amount #" + i + ": ");
            double transactionvalue = read.nextDouble();

            totalsales += transactionvalue;

            if (transactionvalue > highersale) {
                highersale = transactionvalue;
            }

            if (transactionvalue < lowersale) {
                lowersale = transactionvalue;
            }
        }

        double averagesales = totalsales / numtrade;

        System.out.println("\nSales statistics of the day:");
        System.out.println("Total of sales: $" + totalsales);
        System.out.println("Average sales per transaction: $" + averagesales);
        System.out.println("Higher transaction: $" + highersale);
        System.out.println("Lower transaction: $" + lowersale);

    }
}

