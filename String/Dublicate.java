package String;

public class Dublicate {
    
    public static void main(String[] args) {
        
        String s = "programming";
        String ss = "";

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ss.indexOf(ch) == -1)
                ss+=ch;
        }
        System.out.println(ss);
    }
}
