
public class nthFibonacci {

    public static int fibo(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(fibo(n));
    }
    
}
