import  java.util.*;

public class ReverseFirstKthelement {

    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        int k=3;
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        int n=q.size();
        System.out.println(q);

        for(int i=0;i<k;i++){
            int top=q.remove();
            s.push(top);

        }
        while(s.size()>0){
            int top=s.pop();
            q.add(top);
        }
       
       
        
        for (int i = 0; i < n-k; i++) {
            int top=q.remove();
            q.add(top);            
        }
        System.out.println(q);

    }
    
}
