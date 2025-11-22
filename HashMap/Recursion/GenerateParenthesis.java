public class GenerateParenthesis   {
    public static void helper(int open,int close,String s ,int n){
        int len=s.length();

        if(len==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) helper(open+1,close,s+"(",n);
        if(open>close){
            helper(open,close+1,s+")",n);
           
        
        }
    }
    public static void main(String[] args) {
        int  n=3;
        helper(0,0,"",n);
    }
    
}
