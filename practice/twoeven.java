package practice;

public class twoeven {
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 6;
        // if(num1%2==0 && num2%2==0){
        //     System.out.println("both numbers are even");
        // } else {
        //     System.out.println("at least one number is not even");
        // }

        if(num1%2==0){
            if(num2%2==0){
                System.out.println("Boths are Even numbers");
            }

        }    
        else {
            if(num2%2!=0){
                System.out.println("Num2 is ODD number");
            } else {
                System.out.println("both numbers are ODD numbers");
            }
        }
    }
    
}