import java.util.Scanner;

public class patterngenrator5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of rows you want to print: ");
        int inp = sc.nextInt();

        System.out.println("printing pattern.....\n");

        for (int i = inp; i > 0; i--) {
            for(int j = inp - i; j > 0; j--) {
                System.out.print("  ");
            }
            if(i == 1) {
                System.out.print("* ");
            } else if(i == inp) {
                for(int k = 2 * i - 1; k > 0; k--) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for(int k = 2 * i - 2; k > 1; k--) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}


// * * * * *
//  *     *
//   *   *
//    * *
//     *