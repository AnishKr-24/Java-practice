public class Cherimus2 {
    public static void main(String[] args) {
        int blocks = 4; 
        int baseHeight = 3; 
        int maxWidth = 2 * (baseHeight + blocks - 1) + (blocks - 1) * 2 - 1;
        int currentHeight = baseHeight;
        for (int b = 1; b <= blocks; b++) {
            for (int i = 1; i <= currentHeight; i++) {
                int stars = 2 * i - 1 + (b - 1) * 2;
                int spaces = (maxWidth - stars) / 2;
                for (int s = 1; s <= spaces; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            currentHeight++;
        }
        int stemHeight = 6;
        int stemWidth = 3;
        int stemSpaces = (maxWidth - stemWidth) / 2;
        for (int i = 1; i <= stemHeight; i++) {
            for (int s = 1; s <= stemSpaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stemWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
