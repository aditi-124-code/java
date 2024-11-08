import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int num : arr) {
                if (num % 2 != 0) {
                    sum += num;
                }
            }

            System.out.println("Sum of odd numbers in the array: " + sum);
        }
    }
}

