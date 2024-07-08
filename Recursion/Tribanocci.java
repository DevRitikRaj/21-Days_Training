public class Tribanocci {
    public static int Tri(int n){
        if(n==0 || n==1 || n==2){
            return  0;
        }
        if(n==3){
            return 1;
        }
        int trib=Tri(n-1)+Tri(n-2)+Tri(n-3);
        return trib;
    }
    public static void main(String[] args) {
        int n=5;
       int res= Tri(n);
       System.out.println(res);
        
    }
    
}
