import javax.swing.*;
import java.util.Date;

public class Exercise2_27 {
    public static void main(String[] args) {
        int year;
        int month = Integer.parseInt(JOptionPane.showInputDialog("Please enter a month (1-12)"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year "));

        boolean isLeap = leap(year);
        int num = numdays(month, year);

        String[] names = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String monthname = names[month - 1];

        if (isLeap) {
            JOptionPane.showMessageDialog(null, "The month of " + monthname +" "+ year + " has " + num + " days");
            JOptionPane.showMessageDialog(null, "And the year IS leap");
        } else {
            JOptionPane.showMessageDialog(null, "The month of " + monthname +" "+ year + " has " + num + " days");
            JOptionPane.showMessageDialog(null, "And the year IS NOT leap");
        }
    }

    public static boolean leap(int year) {
        if (year <= 0) {
            return false;
        }

        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static int numdays(int month, int year) {
        int numdays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numdays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numdays = 30;
                break;
            case 2:
                if (leap(year)) {
                    numdays = 29;
                } else {
                    numdays = 28;
                }
                break;
            default:
                numdays = -1;
        }
        return numdays;
    }
}