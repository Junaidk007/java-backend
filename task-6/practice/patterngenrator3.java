import java.util.*;

public class patterngenrator3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of rows you want to print: ");
        int inp = sc.nextInt();

        System.out.println("printing pattern.....\n");

        // int middle = inp % 2 == 0 ? inp / 2 : (inp + 1) / 2;


        for(int i = 1; i <= inp; i++) {
            int stars;
            int space;

            if(i <= (inp + 1)/2) {
                stars = 2 * i - 1;
                space = inp - i;
            } else {
                int j = inp - i + 1;
                stars = 2 * j - 1;
                space = inp - j;
            }

            while (space > 0) {
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