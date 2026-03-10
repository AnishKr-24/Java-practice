public class ReverseNum {
    public static void main(String[] args) {
        int n = 3456;
        int rev=0, rem;
        while(n>0){
            rem=n%10;
            rev=rem+rev*10;
            n=n/10;
        }
        System.out.println(rev);
    }
}


