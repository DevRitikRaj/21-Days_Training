public class SumofArray {

    public static int sum(int arr[],int n, int idx){
        if(idx==n){
            return 0;
        }
        return arr[idx]+sum(arr, n, idx+1);
    }

    public static void main(String [] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int res=sum(arr, n, 0);
        System.out.println(res);
        

    }
    
}
