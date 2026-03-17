package practice;

import java.util.Scanner;

public class twomultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        // Nested if-else
        if (a > b) {
            if (a % b == 0) {
                System.out.println(a + " is a multiple of " + b);
            } else {
                System.out.println("No number is a multiple of the other");
            }
        } else {
            if (b % a == 0) {
                System.out.println(b + " is a multiple of " + a);
            } else {
                System.out.println("No number is a multiple of the other");
            }
        }

        sc.close();
    }
    
}
