package Numbers;

public class ArmStrong {
    
    public String armStrong(int num){

        int temp = num;
        int sum = 0;

        while(num > 0){

            int digit = num % 10;
            sum+=digit*digit*digit;
            num/=10;
        }

        if(temp == sum)
          return "is armstrong";
        else
          return "not armstrong";
          
    }

    public static void main(String[] args) {
        
        int num = 153;

        ArmStrong a = new ArmStrong();
        System.out.println(a.armStrong(num));

    }
}
