public class MergeTwoArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,80};
        int [] brr = {40,50,60,70};
        int arr_length = arr.length;
        int brr_lenght = brr.length;
        int crr_length = arr_length + brr_lenght;
        int [] crr = new int[crr_length];

        for (int i=0; i<arr_length; i++){
            crr[i] = arr[i];
        }
        for (int i=0; i<brr_lenght; i++){
            crr[arr_length+i] = brr[i];
        }
        for (int i=0; i<crr_length; i++){
            System.out.print(crr[i]+ " ");
        }
    }
}
