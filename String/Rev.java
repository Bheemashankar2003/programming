package String;

public class Rev {
    
    public static void main(String[] args) {
        
        String rev = "hello";
        String s = "";

        for(int i = rev.length()-1;i>=0;i--){
            s+=rev.charAt(i);
        }
        
        System.out.println(s);
    }
}
