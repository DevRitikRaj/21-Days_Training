public class ArrayCompare {
    public static void main(String [] args){
        int arr[]={7,1,-7,-17,70,190,17,102,-250,25};
        int min=0,max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=arr[min]){
               min=i;
            }
            if(arr[i]>=arr[max]){
                max=i;
            }

        }
        System.out.println("The Smalllest number is"+arr[min]+" And the index is "+min);
        System.out.println("The largest number is "+arr[max]+" And the index is "+max);

       
        
       

    }
    
}
