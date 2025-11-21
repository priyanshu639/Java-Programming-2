

public class RemoveFromString {

    public static void print(int i,String s,String k){
        if(i==s.length()){
            System.out.println(k);
            return;
        }
        if(s.charAt(i)!='a'){
            k+=s.charAt(i);
            
        }
        print(i+1,s,k);

    }

    public static void main(String[] args) {
        String s="Raghav kumar mishra";
        String k="";
        print(0,s,k);
    }
    
}
