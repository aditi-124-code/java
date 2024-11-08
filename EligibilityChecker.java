import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\nStudent " + i + ":");
            System.out.print("Marks in Mathematics: ");
            int mathMarks = scanner.nextInt();
            System.out.print("Marks in Physics: ");
            int physicsMarks = scanner.nextInt();
            System.out.print("Marks in Chemistry: ");
            int chemMarks = scanner.nextInt();
            boolean eligible = false;
            int totalMarks = mathMarks + physicsMarks + chemMarks;
            int mathPhysicsTotal = mathMarks + physicsMarks;

            if (mathMarks >= 60 && physicsMarks >= 50 && chemMarks >= 40) {
                if (totalMarks >= 200 || mathPhysicsTotal >= 150) {
                    eligible = true;
                }
            }

            if (eligible) {
                System.out.println("Eligible for admission.");
            } else {
                System.out.println("Not eligible for admission.");
            }
        }
        scanner.close();
    }
}

