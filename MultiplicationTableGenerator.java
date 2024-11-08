import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for which you want to generate the multiplication table: ");
        int baseNumber = scanner.nextInt();

        System.out.print("Enter the range (up to which multiple): ");
        int range = scanner.nextInt();

        System.out.println("Multiplication table for " + baseNumber + " up to " + range + ":");

        for (int i = 1; i <= range; i++) {
            int product = baseNumber * i;
            System.out.println(baseNumber + " × " + i + " = " + product);
        }
        scanner.close();
    }
}

