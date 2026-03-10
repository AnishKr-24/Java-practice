public class ArmstarongNum {
    public static void main(String[] args) {
        int num = 153;
        int rev = 0, rem;
        int m = num;
        while (num > 0) {
            rem = num % 10;
            rev = rem * rem * rem + rev;
            num = num / 10;
        }
        if (m == rev) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}


//153=1*1*1 + 5*5*5 + 3*3*3 -> It is Armstrong number.