public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java is powerful";
        String result = "";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }
            result = result + rev + " ";
        }
        System.out.println("Original: " + str);
        System.out.println("Reversed words: " + result.trim());
    }
}
