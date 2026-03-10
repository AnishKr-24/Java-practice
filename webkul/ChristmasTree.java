import java.util.Scanner;
public class ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n-i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i % 3 == 0 && j % 4 == 0) {
                    System.out.print("O");
                } 
                else if (i % 4 == 0 && j % 3 == 0) {
                    System.out.print("+");
                } 
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        int stemHeight = 4;
        int stemWidth = 5;
        for (int i = 1; i <= stemHeight; i++) {
            for (int s = 1; s <= n - stemWidth / 2 - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stemWidth; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
