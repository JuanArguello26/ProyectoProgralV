public class Exercise2_30 {

    public static boolean itsmagic(int num) {
        while (num >= 10) {
            int Sumdig = 0;
            while (num > 0) {
                Sumdig += num % 10;
                num /= 10;
            }
            num = Sumdig;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        int num2 = 1234;

        if (itsmagic(num2)) {
            System.out.println(num2 + " it's a magic number.");
        } else {
            System.out.println(num2 + " Isn't a magic number.");
        }
    }
}

