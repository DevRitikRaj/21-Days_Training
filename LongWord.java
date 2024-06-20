public class LongWord {
    public static void main(String [] args){
        String str="word";
        int Strlen=str.length();
        if(Strlen>10){
           int  count=0;
            for(int i=0;i<str.length()-2;i++){
                count++;

            }
            System.out.println(""+str.charAt(0)+""+count+""+str.charAt(str.length()-1));
           
           
        }
        else{
            System.out.println(str);
        }

    }

    
}
