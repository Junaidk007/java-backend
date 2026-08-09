import java.util.*;

public class GradeCalculator {

    static void evaluation(float atten, float total) {
        if (atten < 75)
            throw new IllegalArgumentException("Debarred: Attendance below 75% \nJao ghar jao...\n");

        if (total >= 90) {
            System.out.println("Grade: A (Outstanding, oye hoe topper)");
        } else if (total >= 75) {
            System.out.println("Grade: B (Good, abhi bhi padh bhai)");
        } else if (total >= 60) {
            System.out.println("Grade: C (Average, thoda aur padhle bhai)");
        } else if (total >= 40) {
            System.out.println("Grade: D (Pass, bas paas hi hua hai)");
        } else {
            System.out.println("Grade: F (Fail, sharm krle tudi)");
        }

        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("\nEnter your acadminc details below");
            System.out.println("-------------------------------");

            System.out.println("Enter your attendance in percentage [0, 100]: ");

            float atten = sc.nextFloat();

            if (atten < 0 || atten > 100) {
                throw new IllegalArgumentException("Invalid attendance percentage");
            }

            System.out.println("Enter your total marks in precentage [0, 100]: ");

            float total = sc.nextFloat();

            if (total < 0 || total > 100) {
                throw new IllegalArgumentException("Invalid total marks percentage");
            }

            System.out.println("\nEvaluating your academic performance.....");
            Thread.sleep(3000);
            System.out.println();

            evaluation(atten, total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}