package Assignment_2;

public class ExceptionHandlingDemo {
    public static void demoMethod() throws Exception {
        throw new Exception("Exception thrown from demoMethod()");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            throw new ArithmeticException("Manually thrown exception");

        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
            
            try {
                demoMethod();
            } catch (Exception e1) {
                System.out.println("Caught an exception from demoMethod(): " + e1.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");
    }
}

