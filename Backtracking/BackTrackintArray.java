public class BackTrackintArray {
    public static void ChangeArray(int arr[],int i,int val){
        // Base Case
        if(i==arr.length){
            PrintArr(arr);
            return;
        }

        // Input the value
        arr[i]=val;
        ChangeArray(arr, i+1, val+1);
        arr[i]=arr[i]-2;
        
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        ChangeArray(arr, 0, 1);
        PrintArr(arr);
        
    }
    
}
