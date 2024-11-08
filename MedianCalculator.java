import java.util.Arrays;
import java.util.Scanner;

public class MedianCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        double[] numbers = new double[numElements];
        System.out.println("Enter the elements:");

        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextDouble();
        }
        Arrays.sort(numbers);

        double median;
        if (numElements % 2 == 0) {
            int middleIndex1 = numElements / 2 - 1;
            int middleIndex2 = numElements / 2;
            median = (numbers[middleIndex1] + numbers[middleIndex2]) / 2.0;
        } else {
            int middleIndex = numElements / 2;
            median = numbers[middleIndex];
        }

        System.out.println("Median: " + median);
    }
}
