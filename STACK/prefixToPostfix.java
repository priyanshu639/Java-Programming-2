import java.util.Stack;

public class prefixToPostfix {
    // CONVERSION OF PREFIX EXPRESSION TO POSTFIX EXPRESSION

    public static void main(String[] args) {
        String prefix="-9/*+5346";// convert this to 
        Stack<String>st=new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){
            char ch=prefix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){// digit h
                st.push(ch+"");
            }
            else{
                String val2=st.pop();
                String val1=st.pop();
                
                

                String t=val2+val1+ch;
                st.push(t);
            }

        }
        System.out.println(st.peek());
    }
    
}
