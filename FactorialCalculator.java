public class FactorialCalculator {
    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        
        int number = 5; // Replace with the number for which you want to calculate the factorial
        long result = calculator.calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
