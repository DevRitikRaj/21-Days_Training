public class AllPermutation {
    public static void AllPerm(String str, String ans){
        if(str.length()==0){
            System.err.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String NewString=str.substring(0,i)+str.substring(i+1);
            AllPerm(NewString,ans+curr);
        }
       
    }
    public static void main(String[] args) {
        String s="abc";
        AllPerm(s, "");
        
    }
    
}
