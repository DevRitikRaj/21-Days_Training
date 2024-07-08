public class IncreasinOrder {
    public static void Incresing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        Incresing(n-1);
        System.out.println(n);
        

    }
    

    public static void main(String[] args) {
        int n=5;
        Incresing(n);
        

        
    }
    
}
