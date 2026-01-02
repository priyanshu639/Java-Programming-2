public class knapsack {
    public static int helper(int[] wt,int[] val,int target,int i,int[][]dp){
        if(i==wt.length){
            return 0;

        }
        if(dp[i][target] != -1) return dp[i][target];

        
        int skip=helper(wt, val, target, i+1, dp);
        if(wt[i]>target) return dp[i][target]=skip;
        int pick=val[i]+helper(wt, val, target-wt[i], i+1, dp);
        return dp[i][target]=Math.max(pick,skip);
        
    }

    public static void main(String[] args) {
        int wt[]={1,2,8,10};
        int val[]={5,3,9,16};
        int target=8;
        int dp[][]=new int[wt.length][target+1];
        for (int i = 0; i <dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
                
            }
            
        }
        System.out.println(helper(wt,val,target,0,dp));
    }
    
}
