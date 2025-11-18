
public class printSum {
    // public static void sum(int n,int x){
    //     if(n==0){
    //         System.out.println(x);
    //         return;
    //     }
    //     sum(n-1,x+n);
    // }
    // public static void main(String[] args) {
    //     int n=100;
    //     sum(n,0);
    // }
    
    


  public static int sum(int n){
        if(n==0 || n==1 ) return n;
        return n + sum(n-1);
       
        
    }
    public static void main(String[] args) {
        int n=5;
       System.out.println(sum(n));
    }
    
    }


