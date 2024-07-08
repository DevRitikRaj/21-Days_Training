public class Fabonacci {
    public static int fun(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fofn=fun(n-1)+fun(n-2);
        return  fofn;
        
    }
    public static void main(String[] args) {
        int n=7;
        int res=fun(n);
        System.out.println(res);
        
    }
    
}
