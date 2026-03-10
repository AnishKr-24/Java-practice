public class LinearSearchh {
    public static void main(String[] args) {
        int [] arr = {5,3,6,8,9};
        int target = 6;
        int temp=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Item is found " +i);
                temp = temp+1;
            }
        }
        if(temp ==0){
            System.out.println("Item Is Not found");
        }
    }
}
