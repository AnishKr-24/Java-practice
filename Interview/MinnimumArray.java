public class MinnimumArray {
    public static void main(String[] args) {
        int[] a = {32,54,2,7,45};
        int minn = a[0];
        for (int i=0; i<a.length; i++){
            if(minn > a[i]){
                minn = a[i];
            }
        }
        System.out.print("Minimum of Array " +minn);
    }
}
