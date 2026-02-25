
import java.util.Stack;

public class prefixExpression {
    // evaluation of postfix expression
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();

        String s="-9/*+5346";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)(ch);
            if(ascii>=48  && ascii<=57){//value h 0 to 9 tk
                
                st.push(ascii-48);


            }
            else{
                int val1=st.pop();
                
                int val2=st.pop();

                if(ch=='-') st.push(val1-val2);
                if(ch=='+') st.push(val1+val2);
                if(ch=='/') st.push(val1/val2);
                if(ch=='*') st.push(val1*val2);
            }


        }
        System.out.println(st.peek());
        
    }
    
}
