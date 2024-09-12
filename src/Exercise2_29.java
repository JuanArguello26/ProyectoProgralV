import java.util.Scanner;

public class Exercise2_29 {
    public static void main(String[] args) {


        Scanner keyboard= new Scanner(System.in);

        System.out.println("Please enter a number to be the size of the Maxtrix: ");

        int size =keyboard.nextInt();

        if (size <= 0) {
            System.out.println("Size must be greater than 0!!!");
            return;
        }
        int[][] idenmatrix = genmatrix(size);
        print(idenmatrix);
    }


    public static int[][] genmatrix(int n) {
        int[][] matrix = new int[n][n];


        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }

        return matrix;
    }


    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}