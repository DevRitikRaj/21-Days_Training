
public class Hollow {

    public static void holl(int n) {
        for (int i = 1; i <= n; i++) {
            for(int sp=0;sp<=i-1;sp++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                if (i == 1 || j == 1 || j == 2 * (n - i) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int sp=0;sp<=i-1;sp++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");

            }
            System.out.println();


        }
    }


    public static void main(String [] args){
        holl(4);
        
    }
    
}
