public class pattern4 {
    public static void main(String[] args){
        int n=5;
        //part 1
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n+2; j++){
                if(i==0 || j==0 || j==n+1 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // part2

        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n+2; j++){
                if(j==0 || j==n+1){
                    System.out.print("e");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //part 3
        for(int i=0; i<(n/2)+1; i++){
            for(int j=0; j<n*2+1; j++){
                if(j>=i && j<=n-1-i || j>=n+1+i && j<=n*2 -i){
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
