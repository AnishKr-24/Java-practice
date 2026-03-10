public class LinearSearchh
{
    public static void main(String[] args) {
        int [] arr = {2,5,6,7,1,8,9};
        int item = 9;
        int temp = 0;
        for (int i=0; i< arr.length; i++){
            if(arr[i] == item){
                System.out.print("element is present at " + i +" index position");
                temp = temp+1;
            }
        }
        if(temp == 0){
            System.out.println("Item is not Present in this array");
        }
    }
}
