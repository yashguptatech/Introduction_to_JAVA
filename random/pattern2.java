package random;

import java.util.Scanner;

public class pattern2 {
    // pattern printing

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = ob.nextInt();
        print(n);
    }

    public static void print(int n) {
        int row=1, nsp=n-1, nst=1;
        while(row<=n) {
            for(int csp=1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*");
            }
            System.out.println();
            nsp--;
            nst=+2;
            row++;
        }
    }
}
