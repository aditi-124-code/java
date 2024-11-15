package Assignment_2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalFinder {
    public static String findCapital(String country) throws NoMatchFoundException {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("Japan", "Tokyo");
        if (capitals.containsKey(country)) {
            return capitals.get(country);
        } else {
            throw new NoMatchFoundException("No matching country found for: " + country);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String country = scanner.nextLine();

        try {
            String capital = findCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}


