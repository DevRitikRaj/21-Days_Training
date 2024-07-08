public class SumMax {

    public static void Max_SumArray(int num[]) {

        int maxsum = Integer.MIN_VALUE;
        
        for (int i = 0; i < num.length; i++) {
           

            for (int j = i; j < num.length; j++) {
               
                int sum = 0;
                

                for (int k = i; k <= j; k++) {

                    sum = sum + num[k];
                    if (sum > maxsum) {
                        maxsum = sum;
                    }
                }
                
                
            }
        }
        System.out.println("maxsum is = " + maxsum);

    }

    public static void main(String args[]) {
        // int num[] = {-2,1,-3,4,-1,2,1,-5,4};
        int num[]={5,-3,5};
        Max_SumArray(num);

    }

}