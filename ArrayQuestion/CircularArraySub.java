public class CircularArraySub{
    
    public static int maxSubarraySumCircular(int[] nums) {
        int max_res = Integer.MIN_VALUE, n = nums.length, max_sum = 0, 
            min_res = Integer.MAX_VALUE, min_sum = 0, sum = 0;
      
        for(int i = 0; i < n; sum+=nums[i], i++) {
            max_sum += nums[i];
            max_res = Math.max(max_res, max_sum);
            if(max_sum < 0) max_sum = 0;

            min_sum += nums[i];
            min_res = Math.min(min_res, min_sum);
            if(min_sum > 0) min_sum = 0;
        }
        return (sum == min_res)? max_res: Math.max(max_res, sum - min_res);
    }

    public static void main(String[] args) {
        int arr[]={5,-3,5};
      int res=  maxSubarraySumCircular(arr);
      System.out.println(res);
    
        
    }
}
