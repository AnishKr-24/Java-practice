import java.util.Scanner;

public class TreePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se input lena
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println("\np4---"); // Image ke hisaab se label

        // Part 1: Upper Pyramid (Top Part)
        // Loop 1 se n tak chalega
        for (int i = 1; i <= n; i++) {
            // Spaces: (n - i) normal space + 3 extra space (base ko center karne ke liye)
            for (int j = 1; j <= (n - i) + 3; j++) {
                System.out.print(" ");
            }
            // Stars: 2*i - 1 formula odd number of stars ke liye (1, 3, 5...)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Part 2: Middle Section (Overlapping Part)
        // Ye loop n/2 + 1 se start hoga (taki thoda neeche se repeat ho)
        for (int i = (n / 2) + 1; i <= n; i++) {
            // Same logic as top part
            for (int j = 1; j <= (n - i) + 3; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n / 2; i++) {
            // Spaces calculation to center the 3 stars
            // (n - 2) space + 3 extra base offset = n + 1 spaces
            for (int j = 1; j <= n + 1; j++) {
                System.out.print(" ");
            }
            // Trunk ki width fix 3 stars hai
            System.out.println("***");
        }

        // Part 4: Base (Neeche ka ground)
        // 2 lines ka base
        for (int i = 1; i <= 2; i++) {
            // Base ki chaudai tree se thodi jyada hai
            // Formula: TreeMaxWidth (2n-1) + ExtraWidth (6)
            for (int j = 1; j <= (2 * n - 1) + 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}