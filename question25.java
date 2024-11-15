package Assignment_2;
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class UserValidation {

    public static void validateUser(String username, String password, String confirmPassword) throws InvalidUsernameException, PasswordMismatchException {
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }
        
        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Password does not match.");
        }
        
        System.out.println("User validated successfully!");
    }

    public static void main(String[] args) {
        String username = "john";
        String password = "password123";
        String confirmPassword = "password123";

        try {
            validateUser(username, password, confirmPassword);
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}

