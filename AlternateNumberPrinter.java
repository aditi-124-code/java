import java.util.Scanner;

public class AlternateNumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Alternate numbers in the array:");
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

