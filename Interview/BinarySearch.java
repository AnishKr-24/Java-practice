public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 }; // must be sorted
        int target = 40;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid; // element found
            } else if (arr[mid] < key) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // element not found
    }
}