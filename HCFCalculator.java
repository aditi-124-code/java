import java.util.Scanner;

public class HCFCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
    private static int calculateHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateHCF(b, a % b);
    
    }
}


