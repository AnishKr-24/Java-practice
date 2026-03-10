import java.util.HashSet;
public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4,5,6};
        //First method ismai pahle se arr sort rhna chaihye.
//        int [] temp = new int[arr.length];
//        int j=0;
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i] != arr[i + 1]){
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//        temp[j] = arr[arr.length-1];
//        for (int i=0; i<arr.length; i++){
//            System.out.print(temp[i] + " ");
//        }
        //Second Method  its important. is mai bina sorted array ke bhi kaam ho jayega
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        for (int no:hs){
            System.out.print(no+ " ");
        }
    }
}
