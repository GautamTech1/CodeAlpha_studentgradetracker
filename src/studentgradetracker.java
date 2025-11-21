import java.util.ArrayList;
import java.util.Scanner;

public class studentgradetracker {

    // Method to calculate grade based on marks
    public static String Getgrade(double marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> marks = new ArrayList<>();
        ArrayList<String> grades = new ArrayList<>();

        System.out.println("====* STUDENT GRADE TRACKER *====");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks (0 - 100) [Integer or Decimal]: ");

            //  This line allows BOTH integer & decimal 
            double score = sc.nextDouble();
            sc.nextLine();

            names.add(name);
            marks.add(score);
            grades.add(Getgrade(score));
        }

        // Calculations
        double total = 0;
        double highest = -1;
        double lowest = 101;

        for (double score : marks) {
            total += score;

            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }

        double average = total / n;

        // Summary Report
        System.out.println("\n===== SUMMARY REPORT =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + names.get(i));
          System.out.println(" | Marks: " + marks.get(i));
          System.out.println(" | Grade: " + grades.get(i));
        }

        System.out.println("\nAverage Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);

        System.out.println("\n===== END =====");
    }
}


