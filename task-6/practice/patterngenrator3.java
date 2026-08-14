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

            if(i <= inp/2) {
                stars = 2 * i - 1;
                space = inp - i;
            } else {
                int j = inp - i;
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

        // int star1 = inp / 2;
        // int star2 = inp - star1;
        

        // for(int i = 1; i <= star1; i++) {
        //     int stars = 2 * i - 1;
        //     int space = star1 - i;

            // while (space >= 0) {
            //     System.out.print(" ");
            //     space--;
            // }

            // while (stars > 0) {
            //     System.out.print("*");
            //     stars--;
            // }

        //     System.out.println();
        // }

        // for(int j = star2; j > 0; j--) {
        //     int stars = 2 * j - 1;
        //     int space = star2 - j;

        //     while (space > 0) {
        //         System.out.print(" ");
        //         space--;
        //     }

        //     while (stars > 0) {
        //         System.out.print("*");
        //         stars--;
        //     }

        //     System.out.println();
        // }

        sc.close();
    }
}