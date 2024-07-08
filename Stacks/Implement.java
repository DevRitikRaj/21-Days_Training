public class Implement{
     public static void main(String [] args){
        newClass st=new newClass();
        st.push(1);
        st.push(2);
     //   System.out.println(st.arr[0]); // Not Access
        System.out.println(st.top());
        
    }

}

 class newClass{
    private int arr[]=new int[100];
    int i=0,size=0;
    public void push(int val){
        arr[i]=val;
        i++;
        size++;

    }

    public void pop(int val){
        i--;
        size--;
    }
    public int top(){
        if(i<=0){
            System.out.println("Stack is Underflow");
            return -1;
            
        }
        return arr[i-1];

    }


}