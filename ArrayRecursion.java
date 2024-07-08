public class ArrayRecursion {  

    public static int  fun(int arr[],int target,int n,int idx){
        if(idx==n){
            return -1;
        }
        else if(arr[idx]==target){
            return  idx;

        }
        else{
        return fun(arr,target,n,idx+1);
    }

            

    }  
     public static void main(String [] args){
        int arr[]={-9,19,8,7,-2,5,6,3,9};
        int target=6;                                                                                                                                                
        int n=arr.length;
        int idx=0;
        int result=fun(arr, target, n,idx);
        if(result==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println(result);
        }
        

    }
    
}
