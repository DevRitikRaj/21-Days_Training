public class Multiples {
    static int count =0;
    public static void Mul(int n, int x){
        if(count==x){
            return;
        }
        System.out.println(n);
        count++;
        Mul(n+3, x);


    }
    public static void main(String []args){
        Mul(3, 5);


    }
}
