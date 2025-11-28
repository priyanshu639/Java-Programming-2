// ab->ab,Ab,aB,AB
public class PermutationWithCase {
    public static void solve(String ip,String op){
        if(ip.length()==0){
            System.out.println(op);
            return ;
        }
        char ch=(ip.charAt(0));
        String op1=op+ch;
        String op2=op+""+Character.toUpperCase(ch);
        ip=ip.substring(1,ip.length());
        
        solve(ip,op1);
        solve(ip, op2);

    }

    public static void main(String[] args) {
        solve("abs"," ");
    }
    
}
