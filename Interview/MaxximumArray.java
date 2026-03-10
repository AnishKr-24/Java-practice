public class MaxximumArray {
    public static void main(String[] args) {
        int[] arr = {3,65,7,8,91,5};
        int maxx=arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i] > maxx){
                maxx = arr[i];
            }
        }
        System.out.println("Maximum Number of Array =" +maxx);
    }
}
