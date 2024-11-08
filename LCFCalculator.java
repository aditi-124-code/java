import java.util.Scanner;

public class LCFCalculator {
    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int gcd = calculateGCD(num1, num2);
        long lcm = (long) num1 * num2 / gcd;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        scanner.close();
    }
}

