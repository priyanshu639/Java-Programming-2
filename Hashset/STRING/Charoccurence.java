public class Charoccurence {
    public static void main(String[] args) {
        // String s="adjcnxanjdaaaannnnnnnnncjnejcnaaaazzzzzzzzzzzzzzzaaa";
        String s="physicwallah";
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=(char)ch - 97;
            freq[index]=freq[index]+1;


        }
        int maxfreq=0;
        for(int i=0;i<freq.length;i++){
            maxfreq=Math.max(maxfreq,freq[i]);

        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==maxfreq){
                char element=(char)(97+i);
                System.out.println(element);
            }
        }
    }
    
}
