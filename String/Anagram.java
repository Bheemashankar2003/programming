package String;

import java.util.Arrays;

public class Anagram {
    
        //booelan return type
    // public boolean anagram(String str, String str2){

    //     str = str.toLowerCase();
    //     str2 = str2.toLowerCase();

    //     char [] ch1 = str.toCharArray();
    //     char [] ch2 = str2.toCharArray();

    //     Arrays.sort(ch1);
    //     Arrays.sort(ch2);

    //     return Arrays.equals(ch1, ch2);
    // }

    public String anagram(String str, String str2){

        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        char [] ch = str.toCharArray();
        char [] ch2 = str.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        if(Arrays.equals(ch, ch2))
          return "is anagaram";
        else
          return "is not an anagram";
    }

    public static void main(String[] args) {
        
        String str = "listen";
        String str2 = "silent";

        Anagram a = new Anagram();
        System.out.println(a.anagram(str, str2));

        //for boolean return type
        // if(a.anagram(str, str2))
        //  System.out.println("is anagram");
        // else
        //   System.out.println("is not an anagram");

    }
}
