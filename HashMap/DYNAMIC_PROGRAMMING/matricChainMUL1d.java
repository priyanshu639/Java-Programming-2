import java.util.*;

public class matricChainMUL1d {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=arr.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(mcm(0,n-2,arr,dp));
    }
    public static int mcm(int i,int j,int arr[],int dp[][]){
        if(i==j)return 0;
        int mincost=Integer.MAX_VALUE;
        if(dp[i][j]!=-1)return dp[i][j];
        for(int k=i;k<j;k++){
            int x=arr[i]*arr[j+1]*arr[k+1];
            int tc=mcm(i, k, arr, dp)+mcm(k+1, j, arr, dp)+x;
            mincost=Math.min(tc, mincost);
        }
        return mincost;
    }
    
}
