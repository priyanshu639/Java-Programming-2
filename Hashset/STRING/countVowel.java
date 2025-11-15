



public class countVowel {
    public static void main(String[] args) {
        String s=" thneje kmsmdom  NDMMXMK S Kooe";
        int vowel=0;
        int consonant =0; 
        for(int i=0;i<s.length();i++){
            char F=s.charAt(i);
            if(F=='a'|| F=='e' || F=='i' || F=='o' ||F=='u' || F=='A' || F=='E' || F=='I' ||F=='O' || F=='U'){
                vowel++;

            }

            else{
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant); //isme space bhi count ho jayega
        
    }
    
}
