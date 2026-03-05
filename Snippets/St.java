package Snippets;

public class St {
    
    public static void main(String[] args) {
        
        String s1 = "java";
        String s2 = "java";
        String s3 = "hello";
        String s4 = "hello";

        String s5 = new String("java");
        String s6 = new String("hello");

        System.out.println(s1 == s2);//t
        System.out.println(s2 == s3);//f
        System.out.println(s3 == s4);//t
        System.out.println(s5 == s6);//f
        System.out.println(s1 == s5);//f

    }
}
