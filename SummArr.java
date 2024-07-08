public class SummArr {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 7, 5, 9};  
        int arr2[] = {2, 4, 6, 8};     
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0, k = 0;

       
        int arr3[] = new int[n + m]; 

        
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

       
        while (i < n) {
            arr3[k++] = arr1[i++];
        }

        
        while (j < m) {
            arr3[k++] = arr2[j++];
        }

        
        arr1 = new int[n + m];

        for (i = 0; i < n + m; i++) {
            arr1[i] = arr3[i];
        }

        
        for (i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
