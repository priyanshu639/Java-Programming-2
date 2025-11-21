public class PreInPost {
    public static void zigzag(int n){
        if(n==0) return;
        System.out.println(n);
        zigzag(n-1);
        System.out.println(n);
        zigzag(n-1);
        System.out.println(n);
        

    }

    public static void main(String[] args) {
        int n=3;
        zigzag(n);
        
    }
    
}
