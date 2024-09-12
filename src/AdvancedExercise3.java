import java.util.Scanner;

public class AdvancedExercise3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the student's name: ");

        String studentname = read.nextLine();

        System.out.print("Enter the first note: ");

        double value1 = read.nextDouble();

        System.out.print("Enter the second note: ");

        double value2 = read.nextDouble();

        System.out.print("Enter the third note: ");

        double value3 = read.nextDouble();

        double finalvalue = (value1 * 0.3) + (value2 * 0.3) + (value3 * 0.4);

        System.out.println("\nthe final note " + studentname + " is: " + finalvalue);

        if (finalvalue >= 3.0) {
            System.out.println(studentname + " passed the course.");
        } else {
            System.out.println(studentname + " failed the course.");
        }

        read.close();
    }
}

