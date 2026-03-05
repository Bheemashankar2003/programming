package Snippets;

public class Te {

    static{
        System.out.println("static block ");//1
    }
    {
        System.out.println("nonstatic block ");//3
    }
    
    public static void main(String[] args) {

        System.out.println("main method");//2
        Te d = new Te();
        
    }
}
