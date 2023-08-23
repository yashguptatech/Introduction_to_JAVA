package Tech_Stuff.random.exceptions;
// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Example of using the custom exception
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new CustomException("Age cannot be negative");
            }
            System.out.println("Age: " + age);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
