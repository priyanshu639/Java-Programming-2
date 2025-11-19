import java.util.*;
public class MazePath {
    public static int path(int strow,int stcol,int n,int m){
        if(strow>m || stcol>n) return 0;
        if(strow==m && stcol==n) return 1;
        int rightways=path(strow +1 ,stcol,n,m);
        int downwords=path(strow, stcol+1, n, m);
        return rightways + downwords;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int strow=1;
        int stcol=1;
        System.out.println(path(strow,stcol,n,m));
    }
    
}
