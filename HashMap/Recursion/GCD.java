public class GCD {
    public static int gcd(int a,int b){
        if(b%a==0) return a;
         return gcd(b%a,a);
    }

    public static void main(String[] args) {
        int a=96;
        int b=30;

        System.out.println(gcd(a,b));
    }
    
}
