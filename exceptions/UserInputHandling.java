package exceptions;
import java.util.Scanner;

public class UserInputHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        try {
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
