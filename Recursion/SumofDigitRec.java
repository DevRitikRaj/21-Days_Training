public class SumofDigitRec {
    static int sum=0;
    public static int fun(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum+rem;
        n=n/10;
        fun(n);
        
        return sum;


    }

    public static void main(String[] args) {
        int n=123;
        int res=fun(n);
        System.out.println(res);

        
    }
    
}
