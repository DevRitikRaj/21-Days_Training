
import java.util.Scanner;

public class Presents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp;
        System.out.println("Enter the sizo of the array");
        n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter the element of the array");
        for (int i = 1; i <=n; i++) {
            temp = sc.nextInt();
            arr[temp] = i;
        }
        System.out.println();

        for(int i=1;i<=n;i++){
            System.out.println(arr[i]);

        }

    }

}
