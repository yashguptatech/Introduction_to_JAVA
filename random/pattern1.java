package random;

import java.util.Scanner;

public class pattern1 {
    //____*
    //___**
    //__***
    //_****
    //*****

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = ob.nextInt();
        print(n);
    }

    public static void print(int n) {
        int row=1, nsp=n-1, nst=1;
        while(row<=n) {
            int csp=1;
            while(csp<=nsp) {
                System.out.print("_");
                csp++;
            }
            int cst=1;
            while(cst<=nst) {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nsp--;
            nst++;
            row++;
        }
    }
}
