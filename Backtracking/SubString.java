public class SubString{
    public static void subStr(String str,String ans,int n,int idx){
        if(idx==n){
            System.out.println(ans);
            return;
        }
        subStr(str, ans, n, idx+1);
        subStr(str, ans+str.charAt(idx), n, idx+1);
    }

    public static void main(String[] args) {
        String s="abc";
        subStr(s, "", s.length(), 0);
        
    }
}