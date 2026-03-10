public class pattern5 {
    public static void main(String[] args) {
        int n = 7;
        //first part
        for (int i = 0; i < (n / 2) + 1; i++) {
            for (int j = 0; j < (n + n / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second part
        for(int i=0; i<(n/2)+1; i++){
            for(int j=0; j<n; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n; j++){
                if(j ==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //third part
        for(int i=0; i<(n/2)+1; i++){
            for(int j=0; j<n+n*2; j++){
                if(j>=i && j<=n-1-i || j>=n*2+i && j<n+n*2-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
