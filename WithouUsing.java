import java.util.Arrays;

public class WithouUsing {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 5, 9};  
        int[] arr2 = {2, 4, 6, 8};     
        
        int n = arr1.length;
        int m = arr2.length;
        
        
        arr1 = Arrays.copyOf(arr1, n + m);
        
        // Indices for arr1 and arr2
        int i = n - 1;  
        int j = m - 1;  
        int k = n + m - 1;  
        
        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }
        
       
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }

      
        for (int p : arr1) {
            System.out.print(p + " ");
        }
    }
}
