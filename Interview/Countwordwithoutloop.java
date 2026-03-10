public class Countwordwithoutloop {
    public static void main(String[] args) {

// Without loop it is most important
        String text = "A B C D";
        String[] words = text.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
        // with loop
//        String text = "Java is a powerful language";
//        int wordCount = 0;
//        boolean inWord = false;
//
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//
//            if (ch != ' ' && !inWord) {
//                wordCount++;
//                inWord = true;
//            } else if (ch == ' ') {
//                inWord = false;
//            }
//        }

//        System.out.println("Total number of words: " + wordCount);
    }
}
