public class LeetCode735 {
   

    public static void main(String [] args){
        int arr[]={-90,70,60,35,-65,180,70,-70,60};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>0  && arr[i]<0){

                    if(Math.abs (arr[j-1])<Math.abs(arr[i])){
                        arr[j-1]=0;
                    }
                    else if(Math.abs(arr[j-1])==Math.abs(arr[i])){
                        arr[j-1]=arr[i]=0;
                        break;
                    }
                }
                else{
                    arr[i]=0;
                    break;
                }

            }
           
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
       
        

    }
    
}
