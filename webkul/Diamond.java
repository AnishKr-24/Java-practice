import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Provide odd n");
            sc.close();
            return;
        }
        int mid = n / 2 + 1;
        for (int i = 1; i <= mid; i++) {
            int stars = 2 * i - 1;
            int spaces = mid - i;
            for (int s = 0; s < spaces; s++)
                System.out.print(" ");
            for (int k = 0; k < stars; k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = mid - 1; i >= 1; i--) {
            int stars = 2 * i - 1;
            int spaces = mid - i;
            for (int s = 0; s < spaces; s++)
                System.out.print(" ");
            for (int k = 0; k < stars; k++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
