class Math {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
}

interface B {
    int divide(int a, int b);
    int multiply(int a, int b);
}

class C extends Math implements B {
    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
    
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class D {
    public static void main(String[] args) {
        C x = new C();
        
        int num1 = 10;
        int num2 = 5;
         
        System.out.println("Addition: " + x.add(num1, num2));
        System.out.println("Subtraction: " + x.subtract(num1, num2));
        System.out.println("Multiplication: " + x.multiply(num1, num2));
        
        try {
            System.out.println("Division: " + x.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
