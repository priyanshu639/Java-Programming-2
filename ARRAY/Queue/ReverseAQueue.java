import java.util.*;
public class ReverseAQueue {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Stack<Integer>s=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        while(q.size()>0){
            int top=q.remove();
            s.push(top);
        }
        while(s.size()>0){
            int top=s.pop();
            q.add(top);
        }
        System.out.println(q);

    }
    
}
