import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("please enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("please enter the operator(+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            
            case '-':
                result = num1 - num2;
                break;
            
            case '*':
                result = num1 * num2;
                break;
            
            case '/':
                result = num1 / num2;
                break;
            
            default:
                System.out.println("Invalid operator.");
                break;
        }

        System.out.println("The result is: " + result);

        scanner.close();
    }
}
