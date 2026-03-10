public class ReverseString {
    public static void main(String[] args) {
        String Name = "Mohan Prasad";
        String ReverseName = "";
        for (int i=Name.length()-1; i>=0; i--){
            ReverseName += Name.charAt(i);
        }
        System.out.println("Reverse The String=" +ReverseName);
    }
}
