
import java.util.*;
public class infixToPostfix{

    public static void main(String[] args) {
        String infix="9-(5+3)*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();

        int n=infix.length();
        for(int i=0;i<n;i++){
            char ch=infix.charAt(i);
            // Ascii value for digit starts from 0-> 48 to 9->57
            int ascii=(int)(ch);
            if(ascii>=48 && ascii<=57){//digit
                // value ko as a string bejo
                String s=""+ch;//typecast hogaya value as a string

                val.push(s);

            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    String val2=val.pop();
                    String val1 =val.pop();
                    char o=op.pop();
                    String t=o+val1+val2;
                    val.push(t);

                }
                op.pop();// '(' ko hata diya 
            }
            else{
                    if(ch=='+'|| ch=='-' ){
                        String val2=val.pop();
                        String val1 =val.pop();
                        char o=op.pop();
                        String t=o+val1+val2;
                        val.push(t);
                        op.push(ch);
                        }
                        
                    if(ch=='/'|| ch=='*' ){
                        if(op.peek()=='*'|| op.peek()=='/'){
                            String val2=val.pop();
                            String val1 =val.pop();
                            char o=op.pop();
                            String t=o+val1+val2;
                            val.push(t);
                            op.push(ch);
                        }
                        else{
                        op.push(ch);
                        }
                    
                    }    
            }
        
        }
        // string ke last length tk traverses kr chuke hai
        while(val.size()>1){
            String val2=val.pop();
            String val1 =val.pop();
            char o=op.pop();
            String t=o+val1+val2;
            val.push(t);
        }
        System.out.println(val.peek());

    }
    
}
