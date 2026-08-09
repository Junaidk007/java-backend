import java.util.*;

public class MenuNavigator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n--- Campus Cafeteria Menu ---");
        System.out.println("1. Order Food");
        System.out.println("2. Check Account Balance");
        System.out.println("3. File a Complaint");
        System.out.println("4. Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("Food menu loading...");
                break;
            case 2:
                System.out.println("Your current balance is $15.50");
                break;
            case 3:
                System.out.println("Complaint logged. Student support will reach out.");
                break;
            case 4:
                System.out.println("Exiting system. Have a great day!");
                break;
            default:
                System.out.println("Invalid choice! Please select an option between 1 and 4.");
                break;
        }

        sc.close();

    }
}
