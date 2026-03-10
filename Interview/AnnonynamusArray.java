public class AnnonynamusArray {
    // Sum of Array.
//    public static void main(String[] args) {
//
//        AnnonynamusArray.sum(new int[]{10,20,30});
//    }
//    static  void sum(int[] no){
//        int total = 0;
//        for(int i : no){
//            total=total + i;
//        }
//        System.out.println("Sum is : " +total);
//    }


    public static void main(String[] args) {
        int [] arr = {10,20,30};
        int sum =0;
        for (int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
