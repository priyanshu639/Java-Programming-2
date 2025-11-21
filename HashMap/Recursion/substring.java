

public class substring{

    public static void print(int i,String s,String k){
        if(i==s.length()){
            System.out.println(k);
            return;
        }
        print(i+1,s,k);
        print(i+1,s,k+s.charAt(i));
        

    }

    public static void main(String[] args) {
        String s="Raghav";
        String k="";
        print(0,s,k);
    }
    
}
