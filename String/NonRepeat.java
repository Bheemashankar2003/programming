package String;

import java.util.HashMap;

//important
public class NonRepeat {

    public static void main(String[] args) {
        
        String s ="programming";

        int [] count = new int[256];

        for(int i = 0;i<s.length();i++){
            count[s.charAt(i)]++;
        }

        for(int j = 0;j<s.length();j++){
            if(count[s.charAt(j)]==1){
                System.out.println("non-repeating charector "+s.charAt(j));
                break;
            }
        }
    }
    
    // public static void main(String[] args) {
        
    //     String s = "aabbccddeff";

    //     HashMap<Character,Integer> hm = new HashMap<>();

    //     for(char ch : s.toCharArray()){
    //         hm.put(ch, hm.getOrDefault(ch, 0)+1);
    //     }

    //     for(char ch : s.toCharArray()){
    //         if(hm.get(ch)==1){
    //             System.out.println("element found: "+ch);
    //             return;
    //         }
    //     }

    //     System.out.println("element not found");
    // }
}
