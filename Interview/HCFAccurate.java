public class HCFAccurate {
    public static void main(String[] args) {
        int a = 55;
        int b = 24;
        int hcf = 1;
        // Find the smaller of the two numbers
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        // Check every number from 1 to min to find HCF
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
    }
}
