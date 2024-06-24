public class largestmulofthree {
    public static int Mul(int arr[],int n, int lar,int idx){
        if (idx == n) {
            return lar;
        }
        if(arr[idx]%3==0 && arr[idx]%5==0){
           if( lar==-1 ||arr[idx]>arr[lar])
            lar=idx;
           
        }
        lar=Mul(arr, n, lar, idx+1);
        return  lar;


        
    }
    

    public static void main(String [] args){
        int arr[]={3,6,9,15,12};
        int n=arr.length;
        int res=Mul(arr, n, 0, 0);
        System.out.println(res);


    }
    
}
