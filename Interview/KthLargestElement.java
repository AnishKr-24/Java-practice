public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 52, 34};
        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; // Corrected this line
                }
            }
        }

        // Print the Kth largest element
        System.out.println("Kth Largest Element is " + arr[k - 1]);

        // Print the sorted array
        System.out.print("Sorted Array (Descending): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
