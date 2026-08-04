import java.util.*;


public class StudentProfile {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Student Profile Form---\n");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your course: ");
        String course = sc.nextLine();

        System.out.print("Enter your collage: ");
        String collage = sc.nextLine();

        System.out.println(" ");
        System.out.println("----------------------------");
        System.out.println("Storeing details........");
        Thread.sleep(3000);
        System.out.println("Details stored successfully!");
        System.out.println("Showing your details please wait");
        Thread.sleep(2000);
        System.out.println("");

        System.out.println("---Profile Details--- " + "\n" +
        "Name: " + name + "\n" +
        "Age: " + age + "\n" +
        "Course: " + course + "\n" +
        "Collage: " + collage
        );

        sc.close();
    }
}