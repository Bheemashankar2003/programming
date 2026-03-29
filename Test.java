public class Test {
    
    // public static void main(String[] args) {

    //     String name = "hello";
    //     String rev = "";

    //     for(int i = name.length()-1;i>=0;i--){
    //         rev+=name.charAt(i);
    //     }
    //     System.out.println(rev);
    // }

    // public static void main(String[] args) {
    //     String s = "hello";

    //     for(int i = s.length()-1;i>=0;i--){
    //         System.out.print(s.charAt(i));
    //     }
    // }

public static void main(String[] args) {
    
    String str = "hello world";
    String [] s = str.split(" ");

    for(int i = s.length-1;i>=0;i--){
        System.out.println(s.toString());
    }
}
}
