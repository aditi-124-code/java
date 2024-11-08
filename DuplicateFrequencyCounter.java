import java.util.Scanner;

public class DuplicateFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        int[] frequency = new int[n];
        for (int i = 0; i < n; i++) {
            frequency[i] = 1; 
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    frequency[i]++;
                    frequency[j] = 0; 
                }
            }
        }
        System.out.println("Duplicate elements and their frequencies:");
        for (int i = 0; i < n; i++) {
            if (frequency[i] > 1) {
                System.out.println(arr[i] + " occurs " + frequency[i] + " times");
            }
        }
    }
}
