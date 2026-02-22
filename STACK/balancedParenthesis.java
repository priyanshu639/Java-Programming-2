import java.util.*;
public class balancedParenthesis {

    public static boolean balenced(String str){
        Stack<Character>st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;

                } 
                if(st.peek()=='(') st.pop();
                else{
                    return true;
                }

            }
        }
        if(st.size()>0) return  false;
        else return true;

    }
    public static void main(String[] args) {
        String str=")()((())";
        System.out.println(balenced(str));
    }
    
}
