public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {13,5,67,68,9};

        //First Method
//        int temp;
//        for(int i=0; i<arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if(arr[i] < arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("Second Largest element is " +arr[1]);
//        Second Method
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element is: " + secondLargest);
    }
}
