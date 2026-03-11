package String;

public class VowelsConso {
    
    public static void main(String[] args) {
        
        String s = "hello World";
        int vowel = 0;
        int conso = 0;

        s = s.toLowerCase();

        for(int i = 1;i<s.length();i++){
            char ch = s.charAt(i);
        if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
            vowel++;
        }else
          conso++;
        }
        System.out.println("Vowels: "+vowel);
        // System.out.print(" , ");
        System.out.println("Consonents: "+conso);
    }
}
