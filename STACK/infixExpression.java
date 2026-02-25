import java.util.*;
public class infixExpression {

    public static void main(String[] args) {
        String s="(9-5)+3*4/6";
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();

        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            // Ascii value for digit starts from 0-> 48 to 9->57
            int ascii=(int)(ch);
            if(ascii>=48 && ascii<=57){//digit
                val.push(ascii-48);

            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    int val2=val.pop();
                    int val1 =val.pop();
                    
                    if(op.peek()=='-') val.push(val1-val2);
                    if(op.peek()=='+') val.push(val1+val2);
                    if(op.peek()=='/') val.push(val1/val2);
                    if(op.peek()=='*') val.push(val1*val2);
                    op.pop();

                }
                op.pop();// ( ko hata diya 
            }
            else{
                    if(ch=='+'|| ch=='-' ){
                        int val2=val.pop();
                        int val1 =val.pop();
                        
                        if(op.peek()=='-') val.push(val1-val2);
                        if(op.peek()=='+') val.push(val1+val2);
                        if(op.peek()=='/') val.push(val1/val2);
                        if(op.peek()=='*') val.push(val1*val2);
                        op.pop();
                        op.push(ch);
                    }
                    
                    if(ch=='/'|| ch=='*' ){
                        if(op.peek()=='*'|| op.peek()=='/'){
                            int val2=val.pop();
                            int val1 =val.pop();
                            
                            if(op.peek()=='/') val.push(val1/val2);
                            if(op.peek()=='*') val.push(val1*val2);
                            op.pop();
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
            int val2=val.pop();
            int val1 =val.pop();
            
            if(op.peek()=='-') val.push(val1-val2);
            if(op.peek()=='+') val.push(val1+val2);
            if(op.peek()=='/') val.push(val1/val2);
            if(op.peek()=='*') val.push(val1*val2);
            op.pop();
        }
        System.out.println(val.peek());

    }
    
}
