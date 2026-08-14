import java.util.Scanner;

// * * * * *
// * * * *
// * * *
// * *
// *

// for each i/row
// space = n - i
// stars = 2 * n - 1

public class patterngenrator1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of rows you want to print: ");
        int inp = sc.nextInt();

        System.out.println("printing pattern.....\n");

        for(int i = inp; i > 0; i--) {

            int stars = 2 * i - 1;
            int space = inp - i;

            while(space > 0) {
                System.out.print(" ");
                space--;
            }

            while (stars > 0) {
                System.out.print("*");
                stars--;
            }

            System.out.println();
        }

        sc.close();
    }
}