public class reverseSentence {
    // reverse everyword in  agiven sentence

    public static void reverse(StringBuilder sb,int st,int high){

            while(st<=high){
            char temp=sb.charAt(st);
            sb.setCharAt(st,sb.charAt(high));
            sb.setCharAt(high,temp);
            st++;
            high--;



        }
        }
    public static void main(String[] args) {
        
        StringBuilder sb=new StringBuilder(" this is you");
        int i=0;
        int j=0;
        int n=sb.length();

        while(j<n){
            if(sb.charAt(j)!=' ') j++;
            else {
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
                

            
        }
        
        reverse(sb,i,j-1);
        System.out.println(sb);

    }
    
}
