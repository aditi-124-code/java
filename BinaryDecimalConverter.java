import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter a binary number: ");
            String binaryStr = scanner.next();
            int decimalValue = binaryToDecimal(binaryStr);
            System.out.println("Decimal equivalent: " + decimalValue);
        } else if (choice == 2) {
            System.out.print("Enter a decimal number: ");
            int decimalValue = scanner.nextInt();
            String binaryStr = decimalToBinary(decimalValue);
            System.out.println("Binary equivalent: " + binaryStr);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }
    }
    private static int binaryToDecimal(String binaryStr) {
        return Integer.parseInt(binaryStr, 2);
    }
    private static String decimalToBinary(int decimalValue) {
        return Integer.toBinaryString(decimalValue);
    }
}

