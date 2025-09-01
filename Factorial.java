public class Factorial{
    public static long compute(int n){
        long res=1;
        if(n<0) throw new IllegalArgumentException("Negative number: ");
        for(int i=2;i<=n;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args){
        int n=5;
        System.out.println("Factorial of"+n+"is"+compute(n));   
    }
}