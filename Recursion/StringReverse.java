public class StringReverse {
    public static boolean pallidrome(String s, int i, int n){
        if(i==s.length()/2){
            return true;
        }

        if(s.charAt(i)!=s.charAt(n-i-1)){
            return  false;
        }
        return pallidrome(s, i, n);
        
        

    }
    public static void main(String[] args) {
        String str="Racecar";
        int n=str.length();
        boolean res=pallidrome(str, 0, n);
        System.out.println(res);
        
    }
    
}
