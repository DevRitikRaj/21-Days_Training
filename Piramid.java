
public class Piramid {

    public static void Pira(int n) {
        for (int i = 1; i <= n; i++) {
            // Print space
            for (int sp = 0; sp < n - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i-1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for (int sp = 0; sp < n - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i-1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Pira(4);

    }

}
