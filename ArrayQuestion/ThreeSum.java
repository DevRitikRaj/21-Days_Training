public class ThreeSum {
    public static int[] ThreeSum(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        return new int [] {i,j,k};
                    }
                   
                }
            }
        }
        return new int []{-1};

    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=200;
        int ans[]=ThreeSum(arr, target);
        for(int i=0;i<ans.length;i++){
            System.out.println("The index is "+ans[i]);
        }
        
    }
    
}
