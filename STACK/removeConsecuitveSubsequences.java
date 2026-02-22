import java.util.Stack;

public class removeConsecuitveSubsequences {
    static int[] remove(int arr[]){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        for (int i = 0; i < n; i++) {
            int top=arr[i];
            if(st.size()==0||top!=st.peek()) st.push(top);
        
            else if(arr[i]==st.peek()){
                if(i==n-1 || arr[i]!=arr[i+1]){
                st.pop();
            } 

            }
            
        }
        int result[]=new int[st.size()];
        for (int i = st.size()-1; i >= 0; i--) {
            result[i]=st.pop();
            
        }
        return result;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5,5,6,6,7,8,9,9,9};
        int n=arr.length;
        int result[]=remove(arr);
        
        
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
      
        }

    }
    
}
