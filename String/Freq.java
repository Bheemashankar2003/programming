package String;

public class Freq {
    
    public static void main(String[] args) {
        
        String ss = "progr amming";
        String [] s = ss.split(" ");

        int Freq = 0;
        for(int i = 0;i<s.length;i++){
            if(ss!=null){
                Freq++;
            }
        }
        System.out.println(Freq);
    }
}
