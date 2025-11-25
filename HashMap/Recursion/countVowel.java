import java.util.*;
public class countVowel {
    public static int recursion(String n,int count,int i){

        if(i==n.length()){
            return count;
        }
        if(n.charAt(i)=='a'||n.charAt(i)=='e'|| n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u' || n.charAt(i)=='A'  || n.charAt(i)=='E' || n.charAt(i)=='I' || n.charAt(i)=='O' || n.charAt(i)=='U'){
            count=count+1;
        }
        
        return recursion(n,count,i+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();

        System.out.println(recursion(n,0,0));


    }
    
}
