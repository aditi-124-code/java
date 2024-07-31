public class i {
    public static void main(String args[]){
        String name="abcba";
        for(int i=0; i<name.length()/2; i++){
            if(name.charAt(i)==name.charAt(name.length()-i-1)){
                System.out.println("String is palindrome");

            }
            else{
                System.out.println("string is not palindrome");
            }

        }
    }
    
}
