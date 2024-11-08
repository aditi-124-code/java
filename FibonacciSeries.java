import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci series (first " + numTerms + " terms): " + firstTerm + ", " + secondTerm);

        for (int i = 2; i < numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println(); 
        scanner.close();
    }
}

