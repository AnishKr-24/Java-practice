public class forreachloopsyn {
    public static void main(String[] args) {
        int a[] = {10,20,30};

//        for (int i=0; i<a.length; i++){  // simple loop
//            System.out.println(a[i]);
//        }

        // For Each loop
        for (int i: a){
            System.out.print(i+" ");
        }
    }
}
