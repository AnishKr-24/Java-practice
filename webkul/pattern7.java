public class pattern7 {
    public static void main(String[] args) {
        int n = 7;
        // part first
        for (int i = 0; i < (n / 2) + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second part
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n / 2) + 1; j++) {
                System.out.print(" ");
            }    
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // third part
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n + 2 + (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // fourth part
        for (int i = 0; i < (n / 2) + 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) { 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}