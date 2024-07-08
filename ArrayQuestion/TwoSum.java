public class TwoSum {

    public static int[] Sum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int [] {i,j};
                    
                }

            }
        }

        return new int []{};


    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int ans[]=Sum(arr, target);
        for(int i=0;i<ans.length;i++){
            System.out.println("The index is "+ans[i]);
        }

       
        
    }
    
}
