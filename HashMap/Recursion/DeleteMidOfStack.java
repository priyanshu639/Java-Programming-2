import java.util.*;
public class DeleteMidOfStack {
    public static void solve(Stack<Integer>st,int k){
        if(k==1){
            st.pop();
            return;
        }
        int temp=st.peek();
        st.pop();
        solve(st,k-1);
        st.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int k=(st.size()/2)+1;
        solve(st,k);
        System.out.println(st+" ");
    }
    
}
