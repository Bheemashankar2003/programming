package String;

public class CountWords {
    
    public static void main(String[] args) {
        
        String s = "java is a coding language and java is fun";
        //inbuilt method
        String [] words = s.split(" ");
        System.out.println(words.length);
        
    }
}
