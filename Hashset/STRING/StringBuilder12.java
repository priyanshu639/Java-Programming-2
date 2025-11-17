import java.util.Scanner;

public class StringBuilder12 {
    public static void main(String[] args) {
        // StringBuilder sb =new StringBuilder(10);
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());

        // toggle the string means capital letter to small and small letter to capital
        
        Scanner sc=new Scanner(System.in);

        StringBuilder sb =new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            char ch =sb.charAt(i);
            int asci =(int)ch;
            if(asci >= 97){
                asci-=32;
                char w=(char) asci;

                sb.setCharAt(i, w);

            }
            else{
                asci+=32;
                char w=(char) asci;
                
                sb.setCharAt(i,w );
            }
        }
        System.out.println(sb);

       



    }
    
}
