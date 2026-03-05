package Array;

public class MissingNum {
    
    public void missingNum(int [] arr){

        int n = 5;
        int sum = 0;
        int asum = n*(n+1)/2;

        for(int a : arr){
            sum+=a;
        }
        System.out.println(asum-sum);
    }

    public static void main(String[] args) {
        
        int [] arr = {1,2,3,5};

        MissingNum ms = new MissingNum();
        ms.missingNum(arr);
    }
}
