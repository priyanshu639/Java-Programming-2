public class recursive {
     static int fastExponential(int n,int pow){
        if (pow==0) {
            return 1 ;
        }
        if(pow==1){
            return n;
        }
        if(pow%2==0){
           int h= fastExponential(n, pow/2);
           return h*h;

        }
        else{
            int reccall=fastExponential(n,pow/2);
            return reccall*reccall*n ;
        }
         

    }
    public static void main(String[] args) {
        int n=2;
        int pow=4;
        System.out.println(fastExponential(n,pow));

    }
    
}
