public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {6,21,1,32,3,65};
        //First Method
        int temp;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Smallest element is " +arr[1]);
//    Second Method
//        int n = arr.length;
//
//        int smallest = arr[0];
//        int secondSmallest = arr[0];
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] < smallest) {
//                secondSmallest = smallest;
//                smallest = arr[i];
//            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
//                secondSmallest = arr[i];
//            }
//        }
//        System.out.println("Second largest element is: " + secondSmallest);
    }
}
