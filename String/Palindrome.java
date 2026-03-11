package String;

public class Palindrome {
    
    public static void main(String[] args) {
        
        String palin = "maDaM";
        palin=palin.toLowerCase();
        String rev ="";

        for(int i = palin.length()-1;i>=0;i--){
            rev+=palin.charAt(i);
        }
        if(rev.equals(palin))
          System.out.println("palindrome");
        else
          System.out.println("is not an palindrome");
        System.out.println(rev);
    }
}
