public class NumPiramid {


    public static void piramid(int n){
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println();

        }

        for(int i=n-1;i>=1;i--){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println();

        }
        

    }
    public static void main(String[] args) {
        piramid(4);
        
    }
    
}
