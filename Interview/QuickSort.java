public class QuickSort { // Most Important For Interview
    int[] arr;

    public static void main(String[] args) {
        int[] inputArr = {4, 1, 56, 7, 34};
        QuickSort qs = new QuickSort();
        qs.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }

    public void sort(int[] inputArr) {
        this.arr = inputArr;
        quickSort(0, arr.length - 1);
    }

    public void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high); // partition index
            quickSort(low, pi - 1);  // Left side
            quickSort(pi + 1, high); // Right side
        }
    }

    public int partition(int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

