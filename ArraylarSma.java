public class ArraylarSma {

    public static int CompareSmall(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<small){
                small=arr[i];
               

            }
           
        }
        return small;
    }
    public static int CompareLarge(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>large){
                large=arr[i];
               

            }
           
        }
        return large;
    }
    public static void Sorting(int arr[]){

    }



    public static void main(String [] args){
        int arr[]={7,1,-17,70,190,17,102,-250,25};
       int res=CompareSmall(arr);
       System.out.println("The smallest value is"+res);

       int rel=CompareLarge(arr);
       System.out.println("The Largest value is "+rel);
 

    }
    
}
