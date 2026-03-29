package String;

public class Rotate {
    
    public static void main(String[] args) {
        
        String str = "abcd";
        String str2 = "cdab";

        if(str.length() != str2.length())
          System.out.println("lengths are not matching");

        String add = str+str2;

        if(add.contains(str2)){
          System.out.println("element founds");
          return;
        }
        
        System.out.println("no element found ");
    }
}
