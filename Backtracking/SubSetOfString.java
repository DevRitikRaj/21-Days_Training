public class SubSetOfString {
    public static void SubSet(String str,String ans,int idx){
        //Base Case
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        SubSet(str, ans+str.charAt(idx), idx+1); // if you want YES
        SubSet(str, ans, idx+1);
    }
    public static void main(String[] args) {
        String str="abc";
        SubSet(str, "", 0);
        
    }
    
}
