public class SumofAllDigit {
    
    public static  void fun(int n){
        int sum=0;      
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);

    }


    public static void main(String [] args){
        int n=123;
        fun(n);


    }
    
}
