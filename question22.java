package Assignment_2;

class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class CustomArithmeticDemo {
    public static double calculateEquation(int a, int b, int c) throws CustomArithmeticException {
        try {
            double result = a / b; 
            result += a % c;     
            result += Math.sqrt(c); 
            return result;
        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("Arithmetic error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 0, c = -5;

        try {
            double result = calculateEquation(a, b, c);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}


