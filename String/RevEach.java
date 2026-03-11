package String;

public class RevEach {
    
    public static void main(String[] args) {
        
        String s = "hello bheemu";
        String [] str = s.split(" ");

        for(String st: str){
            for(int i = st.length()-1;i>=0;i--){
                System.out.print(st.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
