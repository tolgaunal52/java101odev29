import java.util.Scanner;

public class odev29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, i, j, k;

        System.out.print("Basamak Sayisini Giriniz : ");
        a = input.nextInt();

        for (i = a ; i > 0; i--) {

            for (k = a - i; k > 0; k--) {
                System.out.print(" ");
            }

            for (j = (2 * i)-1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
