package module1;
import java.util.Scanner;
public class check_prime_number{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fn_prime(n);
    sc.close();        
    }
    
public static void fn_prime(int num) {
int count = 0;
System.out.println("User wnts to check" + num);
for(int i=2; i<num; i++) {
    if(num%i == 0) {
        count++;
        break;
    }
}

if(count == 0) {
    System.out.println("Prime Number");
}
else {
    System.out.println("Not a Prime Number");
}

}
}
