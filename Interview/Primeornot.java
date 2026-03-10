public class Primeornot {
    public static void main(String[] args) {
        int n=11;
        boolean isprime = true;
        if(n<=1){
            isprime = true;
        }
        for (int i=2; i<n/2; i++){
            if(n%i == 0){
                isprime = false;
                break;
            }
        }
        System.out.println(isprime);
    }
}
