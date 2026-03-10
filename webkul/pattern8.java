public class pattern8 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < (n / 2) + 1; i++) {
            for (int j = 0; j < (2 * n) + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n * 2 + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
            }
        }
        // Part Two
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n * 2 + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
