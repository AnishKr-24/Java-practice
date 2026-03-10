import java.util.*;
public class pattern3 {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        num  = sc.nextInt();
        for(int i=0; i<(num/2)+1; i++){
            for(int j=0; j<num-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print(" ");
            }
            for(int j=0; j<1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<num; i++){
            for(int j = 0; j<num/2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<num +2; j++) {
                if(i ==0 || j==0 || j==num+1){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=0; i<num/2+1; i++){
            for(int j=0; j<num*2+1; j++){
                if(j>=i&&j<=num-1-i||j>=num+1+i&& j<=num*2 -i){
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
