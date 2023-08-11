package random;
import java.util.Scanner;

public class odd_even_car_check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fn_odd_even(n);
        sc.close();
    }
    
    // check sum of odd digits is divisible by 3 or not
    // check sum of even digits is divisible by 4 or not

    public static void fn_odd_even(int num) {
        int sum_odd = 0;
        int sum_even = 0;
        int rem = 0;
        while(num > 0) {
            rem = num%10;
            if(rem%2 == 0) {
                sum_even += rem;
            }
            else {
                sum_odd += rem;
            }
            num = num/10;
        }
        if(sum_odd%3 == 0 || sum_even%4 == 0) {
            System.out.println("Car is Lucky");
        }
        else {
            System.out.println("Car is not Lucky");
        }
    }
}
