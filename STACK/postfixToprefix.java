
import java.util.Stack;

public class postfixToprefix {
    // CONVERSION OF PREFIX EXPRESSION TO POSTFIX EXPRESSION

    public static void main(String[] args) {
        String postfix="953+4*6/-";// convert this to -9/*+5346
        Stack<String>st=new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char ch=postfix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){// digit h
                st.push(ch+"");
            }
            else{
                String val2=st.pop();
                String val1=st.pop();
                
                

                String t=ch+val1+val2;
                st.push(t);
            }

        }
        System.out.println(st.peek());
    }
    
}

