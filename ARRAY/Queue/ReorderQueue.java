import java.util.*;
public class ReorderQueue {
    // question queue give is 1,2,3,4,5,6 you have to make like this using stack 1,6,2,5,3,4
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Stack<Integer>st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int n=q.size();
        System.out.println(q);
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for (int i = 0; i < n/2;i++) {
            st.push(q.remove());
           
        }
    
        for (int i = 0; i < n/2;i++) {
            int top=q.remove();
            
            q.add(st.pop());
            q.add(top);
           
        }
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);

    }
}
