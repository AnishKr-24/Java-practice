public class  KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {12,4,6,21,15,17};
        int k =3;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i == k-1){
                System.out.print("Kth Smallest element is " +arr[i]);
            }
            System.out.println();
        }
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
