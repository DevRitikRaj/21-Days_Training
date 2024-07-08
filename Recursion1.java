public class Recursion1 {

    public static void num(int a, int b){
        if(a<b){
            return;
        }
        System.out.println(a);
        num(a-1, b);
    }
    public static void main(String [] args){
        num(10,1);

    }
    
}
