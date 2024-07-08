public class DecreasigRecursion {

    public static void Dec(int n){
        if(n==0){
           return ;
        }
        System.out.println(n);
        Dec(n-1);
    }




    public static void main(String [] args){
        Dec(10);

    }
    
}
