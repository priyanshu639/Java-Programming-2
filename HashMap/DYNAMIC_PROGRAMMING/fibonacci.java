
public class fibonacci {

    
    public static int helper(int n,int dp[]){
        if(n<=1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int ans=helper(n-1,dp)+helper(n-2,dp);
        dp[n]=ans;
        return ans;
    }
    public static void main(String[] args) {
        int n=4;
        int dp[]=new int[n+1];
        System.out.println(helper(n,dp));
        
    }
}
