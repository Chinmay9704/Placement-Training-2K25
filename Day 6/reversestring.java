public class reversestring {
    public static void main(String[] args) {
        String str = "Chinmay";
        String reversed = "";        
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }        
        System.out.println("Reversed String : " + reversed);
    }
}