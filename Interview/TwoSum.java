public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 11, 15};  // Example array
        int target = 9;                 // Example target
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("No pair found that adds up to the target.");
        }
    }
}
