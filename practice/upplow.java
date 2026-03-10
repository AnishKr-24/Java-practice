package practice;

public class upplow {
    public static void main(String[] args){
        char ch = 'd';
        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        } else if(ch>='A' && ch<='Z'){
            System.out.println("uppercase");
        } else {
            System.out.println("not an alphabet");
        }
    }
    
}
