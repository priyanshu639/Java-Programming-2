// import java.util.*;

// public class frog1 {
//     public static int solve(int arr[],int i){

//         if(i==arr.length-1) return 0;
//         int first=Math.abs(arr[i+1]-arr[i])+solve(arr,i+1);
//         int second=Integer.MAX_VALUE;
//         if(i+2<arr.length)  second=Math.abs(arr[i+2]-arr[i])+solve(arr,i+2);
        
//         return Math.min(first,second);

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             int m=sc.nextInt();
//             arr[i]=m;
            
//         }
        
//         int i=0;
//         System.out.println(solve(arr,i));
//     }
    
// }
import java.util.*;

public class frog1 {
    public static int solve(int arr[],int i,int dp[]){

        if(i==arr.length-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int first=Math.abs(arr[i+1]-arr[i])+solve(arr,i+1,dp);
        int second=Integer.MAX_VALUE;
        if(i+2<arr.length)  second=Math.abs(arr[i+2]-arr[i])+solve(arr,i+2,dp);
        
        return dp[i]=Math.min(first,second);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            arr[i]=m;
            
        }
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        int i=0;
        System.out.println(solve(arr,i,dp));
    }
    
}
