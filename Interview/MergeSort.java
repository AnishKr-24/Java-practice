public class MergeSort { // Most Important For Interview
    int[] arr;
    int[] tempmergeArr;
    int length;

    public static void main(String[] args) {
        int[] inputArr = {4, 1, 56, 7, 34};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }

    public void sort(int[] inputArr) {
        this.arr = inputArr;
        this.length = inputArr.length;
        this.tempmergeArr = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            divideArray(lowerIndex, middle);
            divideArray(middle + 1, higherIndex);
            mergeArray(lowerIndex, middle, higherIndex); // Correct method call
        }
    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex) {
        // Copy both halves into the temp array
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempmergeArr[i] = arr[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (tempmergeArr[i] <= tempmergeArr[j]) {
                arr[k] = tempmergeArr[i];
                i++;
            } else {
                arr[k] = tempmergeArr[j];
                j++;
            }
            k++;
        }

        // Copy the rest of the left side (if any)
        while (i <= middle) {
            arr[k] = tempmergeArr[i];
            k++;
            i++;
        }

        // No need to copy the right half because it's already in place
    }
}
