import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Operations.....");

        System.out.println("Printing name: " + name);
        System.out.println("Printing the length of the string: " + name.length());
        System.out.println("Printing in uppercase: " + name.toUpperCase());
        System.out.println("Printing in lowercase: " + name.toLowerCase());
        System.out.println("Trimed string: " + name.trim());
        System.out.println("Printing 1st char of the string: " + name.charAt(0));
        System.out.println();

        System.out.println("Enter 2nd string: ");
        String name2 = sc.nextLine();
        System.out.println("");

        if(name.equals(name2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }


        System.out.println("Thank You....");
        sc.close();
    }
}