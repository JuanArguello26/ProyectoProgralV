import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AdvancedExercise2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Map<String, Integer> invsee = new HashMap<>();
        invsee.put("Suggar packets", 50);
        invsee.put("Eggs", 100);
        invsee.put("Milk", 30);


        System.out.println("Enter the inventory:");

        Map<String, Integer>  actualphysicinventory = new HashMap<>();
        for (String product : invsee.keySet()) {
            System.out.print("Amount of " + product + ": ");
            int amount = read.nextInt();
             actualphysicinventory.put(product, amount);
        }

        System.out.println("\nDiscrepancy Report:");
        for (String product : invsee.keySet()) {
            int systemamount = invsee.get(product);
            int physicamount =  actualphysicinventory.get(product);

            if (systemamount != physicamount) {
                System.out.println(product + ": System=" + systemamount + ", Physic=" + physicamount + " Discrepancy: " + (systemamount-physicamount));
            }
        }

        read.close();
    }
}







