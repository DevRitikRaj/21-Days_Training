public class ReverseString {

    public static boolean reverse(String s) {
        for(int i=0;i<s.length()/2;i++){
            int n=s.length();
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }


        }
        return  true;
    }

    public static void maid(String [] args){
        String st="abba";
        boolean check=reverse(st);
        if(check){
            System.out.println("String is pallidrome ");
        }
        else{
            System.out.println("No");
        }
        

    }
    
}
