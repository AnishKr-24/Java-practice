public class pattern6 {
    public static void main(String[] args) {
        int n = 7;
        // first part
        for (int i = 0; i < (n / 2) + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // part two
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
        // part three
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j >= n / 2 - i && j >= i - n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n-2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n / 2 + 1; j++) {
                if (j >= n / 2 - i && j >= i - n / 2) {
                    System.out.print("*");
                } 
            }
            System.out.println();
        }
        //part four
        for(int i=0; i<(n/2)+1; i++){
            for(int j=0; j<n-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n/2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
