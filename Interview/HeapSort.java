public class HeapSort { // Most Important For Interview
    int[] arr;
    int n;
    public static void main(String[] args) {
        int[] inputArr = {4, 1, 56, 7, 34};
        HeapSort hs = new HeapSort();
        hs.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }
    public void sort(int[] inputArr) {
        this.arr = inputArr;
        this.n = arr.length;

        // Step 1: Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
        }
        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root (max) with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(i, 0);
        }
    }

    // Maintains max-heap property
    public void heapify(int size, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        // If left child is larger
        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        // If root is not the largest
        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(size, largest);
        }
    }
}
