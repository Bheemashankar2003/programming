package String;

import java.util.HashMap;

public class FirstNonRepeating {
    
    public char freq(String str){

        HashMap<Character, Integer> hm = new HashMap();

        //count freq
        for(char ch : str.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        //non-repeating char
        for(char ch : str.toCharArray()){
            if(hm.get(ch) == 1)
              return ch;
        }
        
        return ' ';      
    }

    public static void main(String[] args) {
        
        String str = "aabbccddeff";
        FirstNonRepeating freq = new FirstNonRepeating();
        char ch = freq.freq(str);
    }
}
