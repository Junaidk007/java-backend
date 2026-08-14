import java.util.*;
//     ****
//    ****
//   ****
//  ****


public class patterngenrator2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of rows you want to print: ");
        int inp = sc.nextInt();

        System.out.println("printing pattern.....\n");

        for(int i = inp; i > 0; i--) {
            int check = i;
            for(int j = i + 4; j > 0; j--) {
                if(check <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                check--;
            }
            System.out.println();
        }

        sc.close();
    }
}