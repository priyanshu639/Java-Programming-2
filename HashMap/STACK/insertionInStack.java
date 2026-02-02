
import java.util.Stack;



public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        // insert at any index or bottom
        int index=2;
        int val=34;
        Stack<Integer> rt=new Stack<>();


        while(st.size()>index){
            rt.push(st.pop());
        }
        st.push(val);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);

        
    }
    
}
