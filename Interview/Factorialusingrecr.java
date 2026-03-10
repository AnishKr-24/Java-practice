public class Factorialusingrecr {
//    static int fac(int n){
      int fac(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * fac(n -1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Factorialusingrecr obj = new Factorialusingrecr();
//        int res = fac(n);
        int res =obj.fac(n);
        System.out.println(res);
    }
} 
