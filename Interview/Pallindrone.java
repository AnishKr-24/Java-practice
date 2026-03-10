public class   Pallindrone {
    public static void main(String[] args) {
        int n=234;
        int m = n;
        int rev=0, rem;
        while(n>0){
            rem=n%10;
            rev=rem+rev*10;
            n=n/10;
        }
        System.out.print(rev+" ");
        if(m==rev){
            System.out.println("pallindrone");
        }
        else{
            System.out.println("Not pallindrone");
        }
    }
}

