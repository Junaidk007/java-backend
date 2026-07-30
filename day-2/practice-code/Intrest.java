import java.util.Scanner;


public class Intrest {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        int principal = sc.nextInt();
        
        System.out.print("Enter the rate of intrest: ");
        float rate = sc.nextFloat();

        System.out.print("Enter the time period: ");
        float time = sc.nextFloat();

        System.out.println();

        float intrest = (principal * rate * time) / 100;
        System.out.println("Intrest: " + intrest);
        
        sc.close();
    }

}    