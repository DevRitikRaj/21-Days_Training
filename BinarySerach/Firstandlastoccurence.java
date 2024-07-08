
public class Firstandlastoccurence {

    public static int[] Occ(int arr[], int target) {
        int n = arr.length;
        int left = 0;
        int right = n;
       
        while (left < right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                int fo=mid;
                int lo=mid;
              while(fo>0 && arr[fo-1]==target){
                fo--;
              }  
              while(lo<n-1 && arr[lo+1]==target){
                lo++;
              }
              return new int[]{fo,lo};

            } else if (arr[mid] > target) {
                right= mid - 1;
            }
            else{
                left=mid+1;
            }
           
        }
        return new int[] {-1,-1};


    }

    public static void main(String[] args) {
        int arr[]={5,7,8,8,10};
        int target=8;
        int res[]=Occ(arr, target);
        System.out.println(res[0]+" "+res[1]);
        

        

    }                                                                                                                                                               

}
