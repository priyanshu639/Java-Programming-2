import java.util.*;
public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer>q=new ArrayDeque<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        Queue<Integer>helper=new ArrayDeque<>();
        while(q.size()>0){
            int top=q.remove();
            System.out.print(top+"->");
            helper.add(top);

        }

    }

    
}
