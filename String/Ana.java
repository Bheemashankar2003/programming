package String;

import java.util.Arrays;

public class Ana {
    
    public static void main(String[] args) {
        
        String s = "listen";
        String s2 = "silent";

        s = s.toLowerCase();
        s2 = s2.toLowerCase();

        char [] ch1 = s.toCharArray();
        char [] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2))
          System.out.println("is anagram");
        else
           System.out.println("is not a anagram");
    }
}
