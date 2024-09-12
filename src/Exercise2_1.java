public class Exercise2_1 {

    public static void main(String[] args) {

        int sum = 0;


        int n = 10;
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

}

