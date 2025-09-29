
import java.util.ArrayList;

public class Implement_Stack_array {

    static class stack{
        ArrayList<Integer> arr;
        int tracker=0;

        public stack() {
            arr=new ArrayList<>();
        }
        
         public void  push(int val){
            arr.set(tracker,val);
            tracker++;
            
            


        }
        public int peek(){
            if(tracker==0)
            return arr.get(tracker-1);
        } 
        public int pop(){
            if(tracker==0){
                System.out.println("underflow");
            }
            tracker--;
            return arr.get(tracker);

        }
        boolean isEmpty(){
            return tracker==0;
        }

    }
    public static void main(String[] args) {
        
        

       
    }
    
}
