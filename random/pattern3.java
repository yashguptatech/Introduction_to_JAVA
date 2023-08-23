package random;

import java.util.Scanner;

public class pattern3 {
    // * * * * * * * * * * 
    //   * * * * * * * *
    //     * * * * * *
    //       * * * *
    //         * *
    //          *

   public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = ob.nextInt();
        print(n);
    }

    public static void print(int n) {
        int row=1, nsp=0, nst=2*n-1;
        while(row<=n) {
            int csp=1;
            while(csp<=nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst=1;
            while(cst<=nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nsp++;
            nst-=2;
            row++;
        }
    }
}
