import java.util.Scanner;

public class patterngenrator6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of rows you want to print: ");
        int inp = sc.nextInt();

        System.out.println("printing pattern.....\n");


        // want to print hollow dimond

        for(int i = 1; i <= inp; i++) {
            for(int j = inp - i; j > 0; j--) {
                System.out.print(" ");
            }
            if(i == 1) {
                System.out.print("*");
            }  else {
                System.out.print("*");
                for(int k = 2 * i - 2; k > 1; k--) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = inp - 1; i > 0; i--) {
            for(int j = inp - i; j > 0; j--) {
                System.out.print(" ");
            }
            if(i == 1) {
                System.out.print("*");
            }  else {
                System.out.print("*");
                for(int k = 2 * i - 2; k > 1; k--) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//        *
//       * *
//      *   *
//     *     *
//    *       *
//   *         *
//  *           *
// *             *
//*               *
// *             *
//  *           *
//   *         *
//    *       *
//     *     *
//      *   *
//       * *
//        *

