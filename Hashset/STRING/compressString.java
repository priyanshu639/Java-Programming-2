public class compressString {
    public static void main(String[] args) {
        String s="aaabbcdeeeefffffff";
        char arr[]=s.toCharArray();
        int i=0;
        int j=0;
        String ans=" ";
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
            else{
                ans+=arr[j];
                int len=i-j;
                if(len>1) ans+=len;    
                j=i;

            }
            
        }
        ans+=arr[j];
        int len=i-j;
        if(len>1) ans+=len; 
        System.out.println(ans);

    }
    
}


