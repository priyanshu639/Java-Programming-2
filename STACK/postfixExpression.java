import java.util.Stack;

public class postfixExpression {
    // evaluation of postfix expression
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();

        String s="953+4*6/-";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)(ch);
            if(ascii>=48 && ascii<=57){//value h 0 to 9 tk
                
                st.push(ascii-48);


            }
            else{
                int val2=st.pop();
                
                int val1=st.pop();

                if(ch=='-') st.push(val1-val2);
                if(ch=='+') st.push(val1+val2);
                if(ch=='/') st.push(val1/val2);
                if(ch=='*') st.push(val1*val2);
            }


        }
        System.out.println(st.peek());
        
    }
    
}
