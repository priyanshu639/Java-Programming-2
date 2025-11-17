
public class maxINTinString {
    // maximum integer in a string array without converting it to integer because if we takr large number it will not come under int or long thats why 
    
    public static String max(String a,String b){
            String s=purify(a),t=purify(b);
            if(s.length()>t.length()) return a;
            if(t.length()>s.length()) return b;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=t.charAt(i)){
                    if(s.charAt(i)>t.charAt(i)) return a;
                    else  return b;
                }
            }
            if(a.length()>b.length()) return a;
            else return b;


        }
        public static String purify(String n){
            for(int i=0;i<n.length();i++){
                if(n.charAt(i)!='0') return n.substring(i);

            }
            return n;
        }
    
    
    
    
    public static void main(String[] args) {
        String[] arr={"2334","004","0078","433","00095584"};
        String maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            maxVal=max(maxVal,arr[i]);
        }
        System.out.println(maxVal);


        

    }
    
}
