import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);
        int numDigits = numberString.length();

        System.out.println("Number of digits in " + number + ": " + numDigits);
        scanner.close();
    }
}

