
import java.util.ArrayList;




public class subArray{

    public static void print(int i,int s[],ArrayList<Integer> k){
        if(i==s.length){
            System.out.println(k);
            return;
        }
        
        k.add(s[i]);
        print(i+1,s,k);
        k.remove(k.size()-1);
        print(i+1,s,k);
        

    }

    public static void main(String[] args) {
        int s[]={1,2,3};
        int n=s.length;
        ArrayList<Integer>k=new ArrayList<>();

        print(0,s,k);
    }
    
}

