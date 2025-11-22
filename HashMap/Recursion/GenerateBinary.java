

// ouess== generate all binary string consist of string length without consecutive ones?

public class GenerateBinary {
        public static void binary(String s,int n){
            int m=s.length();
            if(m==n){
                System.out.println(s);
                return ;
            }
            
            if(m==0 || s.charAt(m-1)=='0'){
                binary(s+'0',n);
                binary(s+'1', n);
            }
            else // if(m==0 || s.charAt(m-1)==1)//
            {
                binary(s+'0', n);
            }
            
        }
        public static void main(String[] args) {   
            
            binary("" ,5);
        
        }

    
}    

