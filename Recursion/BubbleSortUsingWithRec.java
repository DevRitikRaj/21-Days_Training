public class BubbleSortUsingWithRec {

    public static void BubbleRec(int arr[], int i, int j){
        if(i>=arr.length-1){
            return;
        }
        if(j<arr.length-1-i){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            BubbleRec(arr, i, j+1);
        }
        BubbleRec(arr, i+1, j);
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,5,4};
        BubbleRec(arr, 0, 0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
