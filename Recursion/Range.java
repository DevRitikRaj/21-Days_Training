public class Range {
    public static void Order(int a, int b){
        if(a>b){
            return;
        }

        System.out.println(a);
        Order(a+1, b);
        
    }
    
    public static void main(String [] args){
        Order(1, 5);

    }
    
}
