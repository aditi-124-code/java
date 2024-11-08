import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'n': ");
        int n = scanner.nextInt();
        long sum = (long) n * (n + 1) / 2;

        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}

