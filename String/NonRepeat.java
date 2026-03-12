package String;

import java.util.HashMap;

public class NonRepeat {
    
    public static void main(String[] args) {
        
        String s = "aabbccddeff";

        HashMap<Character,Integer> hm = new HashMap<>();

        //freq
        for(char c: s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        //
        for(char cc:s.toCharArray()){
            if(hm.get(cc)==1){
                System.out.println(cc);
                return;
            }
        }
        System.out.println("no char found ");
    }
}
