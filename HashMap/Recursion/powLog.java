

public class powLog {
    public static int power(int n, int x){
        if(x==0) return 1;
        int ans=power(n,x/2);
        if(x%2==0) return ans*ans ;
        else{
            return ans*ans*n;
        }
        

    }
    public static void main(String[] args) {
        System.out.println(power(3,9));
    }
    
}

