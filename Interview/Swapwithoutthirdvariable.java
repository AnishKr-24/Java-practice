public class Swapwithoutthirdvariable {
    public static void main(String[] args) {
        int a = 10, b =20;
        System.out.println("Original Value " +a+ " " +b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
          a = a ^ b;
          b = a ^ b;
          a = a ^ b;
        System.out.println("Swap Number "+a+ " " +b);
    }
}
