public class CharOccurence {
    public static void main(String[] args) {
        String str = "programming";
        char target = 'g'; // character to count
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}
