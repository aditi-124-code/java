package Assignment_2;
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the temperature as a command line argument.");
            return;
        }

        try {
            double temperature = Double.parseDouble(args[0]);
            if (temperature > 35) {
                throw new TooHot("Temperature is too hot!");
            } else if (temperature < 5) {
                throw new TooCold("Temperature is too cold!");
            } else {
                System.out.println("Temperature is normal.");
                double fahrenheit = (temperature * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number for the temperature.");
        }
    }
}

