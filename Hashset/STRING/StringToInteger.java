public class StringToInteger {
    // finding the maximum value from the string array of integer data
    public static void main(String[] args) {
        // String s[]={"asxds","dsffvec","dvfcc"};
        String s[]={"1233","232435","33875924"};
        int maxvalue=Integer.parseInt(s[0]);
        for(int i=0;i<s.length;i++){
            int m=Integer.parseInt(s[i]);
            maxvalue=Math.max(maxvalue,m);
            
        }
        System.out.println(maxvalue);
    }
    
}
