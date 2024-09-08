public class Exercise2_14 {

    public static void Pyr(int n){

        int i,j,k;

        for(i=1; i <=n; i++){
            for(j=1; j<=n-i; j++){

                System.out.print(" ");
            }

            for(k=1; k<=2*i-1; k++){

                System.out.print("*");
            }

            System.out.println("");
        }

    }

    public static void main(String[] args) {

            Pyr(5);
    }
}
